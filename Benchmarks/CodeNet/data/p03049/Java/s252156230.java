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

    		String [] strData = new String [cnt];

    		int cntAB = 0;
    		int cntA = 0;
    		int cntB = 0;

    		for (int i=0 ; i<cnt ; i++) {
    			strData[i] = br.readLine();
    			if (strData[i].indexOf("AB") != -1) cntAB ++;
    			if (strData[i].endsWith("A")) cntA ++;
    			if (strData[i].startsWith("B")) cntB ++;

    		}

    		int cmpAB = (cntA < cntB ? cntA : cntB);

       		System.out.println(cntAB + cmpAB);

            out.flush();


        } catch (IOException e) {

        }


    }

}