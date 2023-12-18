import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PrintWriter out = new PrintWriter(System.out);

        try {


    		String strCnt = br.readLine();
    		int cnt = Integer.parseInt(strCnt);

    		String  strData;

    		int cntAB = 0;
    		int cntA = 0;
    		int cntB = 0;

    		for (int i=0 ; i<cnt ; i++) {
    			strData = br.readLine();
//    			if (strData.indexOf("AB") != -1) cntAB ++;
    			cntAB += countStringInString(strData, "AB");
    			if (strData.endsWith("A")) cntA ++;
    			if (strData.startsWith("B")) cntB ++;

    		}

    		int cmpAB = 0;
    		if (cntA < cntB) {
    			cmpAB = cntA;
    		}else {
    			cmpAB = cntB;
    		}

    		if (cmpAB == cnt) cmpAB--;


       		System.out.println(cntAB + cmpAB);

            out.flush();


        } catch (IOException e) {

        }


    }
    public static int countStringInString(String target, String searchWord) {
        return (target.length() - target.replaceAll(searchWord, "").length()) / searchWord.length();
    }

}