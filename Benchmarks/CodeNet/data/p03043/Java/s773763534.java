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
    		String strDat[] = strData.split(" ", -1);

    		int intMaxDice = Integer.parseInt(strDat[0]);
    		int intWinPoint = Integer.parseInt(strDat[1]);

    		int cmp = 1;
    		int intRole = 0;
    		for (intRole = 0 ; ; intRole++) {
    			if (intWinPoint <= cmp) break;

    			cmp *= 2;
    		}
    		double ans = 0;
    		for (int i = 0 ; i < intMaxDice ; i++) {
    			if (intRole > 0)
    				ans = ans += Math.pow(0.5, intRole);
    			else if (i+1 < intWinPoint)
    				ans = ans += Math.pow(0.5, 1);
    			else
    				ans = ans += 1;

    			intRole --;
    		}

    		ans /= intMaxDice;

    		System.out.print(ans );


    		out.flush();


        } catch (IOException e) {

        }


    }


}