import java.util.*;
import java.math.*;
import java.io.*;
public class InfiniteSequence {
    private BigInteger patternBInt;    
    private String patternStr;
    private int patternLen;
    private LinkedList<String> seqNumList = new LinkedList<String>();
    private int patternOffset; 
    public BigInteger indexOf(String pattern) throws NumberFormatException {        
        if (pattern.startsWith("0")) {
            throw new NumberFormatException();
        }   
        patternBInt = new BigInteger(pattern);        
        patternStr = pattern;
        patternLen = pattern.length(); 
        BigInteger result = null;
        LinkedList<String> tempNumList = new LinkedList<String>();
        for (int exp = 1; exp <= patternLen; exp++) {            
            for (int offset = 0; offset < exp; offset++) { 
                tempNumList.clear();                           
                BigInteger curPos = checkNumSequence(exp, offset, tempNumList);                
                if ((curPos != null) && (result == null || 
                        result != null && result.compareTo(curPos) > 0)) {
                    result = curPos; 
                    seqNumList.clear();
                    seqNumList.addAll(tempNumList);       
                    patternOffset = offset;
                }                            
            }
            if (result != null) break;
        }
        return result;
    }
    public String getFoundFragment() {               
        String output = "[";        
        if (seqNumList.size() > 1) {
            int dgtsCount = 0;
            for (int i = 0; i < seqNumList.size(); i++) {                
                String item = seqNumList.get(i);
                if (i == 0) {
                    if (patternOffset > 0) {
                        dgtsCount = item.length() - patternOffset;
                        output += item.substring(0, dgtsCount) + "->" +
                            item.substring(dgtsCount, item.length());
                        dgtsCount = item.length() - dgtsCount;
                    } else {                    
                        output += "->" + item;
                        dgtsCount = item.length();
                    }                                   
                } else if (i == seqNumList.size() - 1) {
                    dgtsCount += item.length();
                    int suffixLen = dgtsCount - patternLen;
                    output += item.substring(0, item.length() - suffixLen) + "<-" +
                            item.substring(item.length() - suffixLen, item.length()) + "]";   
                } else {
                    output += item;
                    dgtsCount += item.length();
                }  
                if (i < seqNumList.size() - 1) {
                    output += ", ";
                }                
            }
        } else {
            output += "->" + seqNumList.get(0) + "<-]";
        } 
        return output;        
    }
    private BigInteger getSequenceItemPos(BigInteger item) {
        BigInteger startPos = BigInteger.ZERO;   
        int itemLen = item.toString().length();
        for (int i = 1; i < itemLen; i++) {            
            startPos = startPos.add(
                    bint(i * 9).multiply(pow10BI(i - 1)));
        }        
        BigInteger offset = item.subtract(pow10BI(itemLen - 1)); 
        return startPos.add(offset.multiply(bint(itemLen))).add(bint(1));                
    }      
    private BigInteger completeLastNum(String unCmplNumStr, 
                                        String prevNumLastDgts) {        
        BigInteger pow10 = pow10BI(prevNumLastDgts.length());
        BigInteger unCmplNum = new BigInteger(unCmplNumStr);
        BigInteger lastDgts = new BigInteger(prevNumLastDgts);
        return lastDgts.compareTo(pow10.subtract(BigInteger.ONE)) == -1 ?
                unCmplNum.multiply(pow10).add(lastDgts.add(BigInteger.ONE)) :
                unCmplNum.multiply(pow10);
    }
    private BigInteger checkNumSequence(int numExp, int offset, 
                                        LinkedList<String> numStrList) {
        String seqOf9 = repeatStr("9", numExp);       
        String curNumStr = null;
        BigInteger curNum = null;
        BigInteger prevNum = null;
        BigInteger firstNum = null;      
        int i = offset;
        while(i < patternLen) {    
            prevNum = curNum;
            if (i + numExp <= patternLen) { 
                curNumStr = patternStr.substring(i, i + numExp);
                if (curNumStr.startsWith("0")) {
                    return null;
                }
                curNum = new BigInteger(curNumStr);
            } else {
                int unkDgtCount = i + numExp - patternLen;     
                String lastNumStr = 
                        patternStr.substring(i, i + numExp - unkDgtCount); 
                if (lastNumStr.startsWith("0")) {
                    return null;
                }
                if (i > offset) {                    
                    curNum = completeLastNum(lastNumStr,
                        curNumStr.substring(curNumStr.length() - unkDgtCount, 
                                            curNumStr.length()));                
                } else {                    
                    curNum = completeLastNum(lastNumStr,
                        patternStr.substring(offset - unkDgtCount, offset));                     
                }                
                curNumStr = String.valueOf(curNum);           
            }
            numStrList.add(curNumStr); 
            if (i > offset && curNum.subtract(prevNum).intValue() != 1) {
                return null;                
            } 
            if (i == offset) { // 1st iteration
                firstNum = curNum;   
                if (offset > 0) { 
                    String offsetDgts = patternStr.substring(0, offset);
                    String testNumStr = curNum.subtract(BigInteger.ONE).toString();
                    int lastDgtsStart = testNumStr.length() - offsetDgts.length();                    
                    if (! offsetDgts.equals(testNumStr.substring(
                            lastDgtsStart < 0 ? 0 : lastDgtsStart, 
                            testNumStr.length()))) {
                        return null;
                    }
                    numStrList.addFirst(testNumStr);
                }                
            }            
            i += numExp;
            if (curNumStr.equals(seqOf9)) {                             
                numExp++;                
                seqOf9 += "9";
            }
        }
        return getSequenceItemPos(firstNum).subtract(bint(offset));
    }
    private static BigInteger pow10BI(int pow) {
        BigInteger biPow = BigInteger.TEN;        
        return biPow.pow(pow);
    }
    private static BigInteger bint(long value) {
        return BigInteger.valueOf(value);
    }
    private static String repeatStr(String s, int n) {
        String result = s;
        for (int i = 1; i < n; i++) {
            result += s;
        }
        return result;
    }
    public static void main(String[] args) {             
        try {
            BufferedReader bufReader = 
                    new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            InfiniteSequence infSeq = new InfiniteSequence();                        
            String numStr;  
            while((numStr = bufReader.readLine()) != null) {                
                try {
                     System.out.println( infSeq.indexOf(numStr));
                } catch (NumberFormatException e) {
                }
            }
        } catch (FileNotFoundException e) {          
        } catch (IOException e) {
        }
    }    
}