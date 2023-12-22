import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_9_C
 * 
 * @author eitatsuro
 * 
 */
public class Main {
    
    public static final String PRINT   = "print";
    public static final String REVERSE = "reverse";
    public static final String REPLACE = "replace";
    
    public static void main(String[] args) {
        try {
            LineNumberReader lineNumReader = new LineNumberReader(
                    new InputStreamReader(System.in));
            
            String inputStr = null;
            String str = null;
            String order = null;
            int a = 0;
            int b = 0;
            int n = 0;
            String p = null;
            
            while ((inputStr = lineNumReader.readLine()) != null) {
                
                // ??????????????????????????????.
                if (lineNumReader.getLineNumber() == 1) {
                    str = inputStr;
                }
                
                if (lineNumReader.getLineNumber() == 2) {
                   String trimmedStr = inputStr.trim();
                    n= Integer.parseInt(trimmedStr);
                }
                
                // ???????????¶.
                if (lineNumReader.getLineNumber() > n + 2) {
                    break;
                }
                
                if (lineNumReader.getLineNumber() > 2) {
                    String[] line = inputStr.split(" ");
                    order = line[0];
                    a = Integer.parseInt(line[1]);
                    b = Integer.parseInt(line[2]);
                    if (REPLACE.equals(order)) {
                        p = line[3];
                    }
                    
                    switch (order) {
                        case PRINT:
                            System.out.println(str.substring(a, b + 1));
                            break;
                        case REVERSE:
                            StringBuilder sb = new StringBuilder(str);
                            sb.delete(a, b + 1);
                            String target = str.substring(a, b + 1);
                            StringBuilder reverseTarget = new StringBuilder(
                                    target);
                            reverseTarget.reverse();
                            sb.insert(a, reverseTarget.toString());
                            str = sb.toString();
                            break;
                        case REPLACE:
                            StringBuilder sbReplace = new StringBuilder(str);
                            sbReplace.delete(a, b + 1);
                            sbReplace.insert(a, p);
                            str = sbReplace.toString();
                            break;
                    }
                }
            }
            
            lineNumReader.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
        
    }
    
    public static String shuffle(String original, int h) {
        StringBuilder shuffledStr = new StringBuilder(original);
        String temp = shuffledStr.substring(0, h);
        shuffledStr.delete(0, h);
        shuffledStr.append(temp);
        return shuffledStr.toString();
        
    }
}