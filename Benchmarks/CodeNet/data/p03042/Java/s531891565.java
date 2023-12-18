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
    		String strData = br.readLine();
    		String strAA = strData.substring(0, 2);
    		String strBB = strData.substring(2, 4);

    		int intAA = Integer.parseInt(strAA);
    		int intBB = Integer.parseInt(strBB);

    		boolean bAA = false;
    		boolean bBB = false;

    		if (intAA >= 1 && intAA <= 12) bAA = true;
    		if (intBB >= 1 && intBB <= 12) bBB = true;

    		if (bAA && bBB) {
    			System.out.print("AMBIGUOUS");
    		} else if (bAA && !bBB) {
    			System.out.print("MMYY");
    		} else if (!bAA && bBB) {
    			System.out.print("YYMM");
    		} else {
    			System.out.print("NA");
    		}


    		out.flush();


        } catch (IOException e) {

        }


    }


}