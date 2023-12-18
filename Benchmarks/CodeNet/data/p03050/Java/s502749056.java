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
    		long cnt = Long.parseLong(strCnt);

    		long intDiv;
    		long intMod;
    		long ans = 0;

    		for (long i = 1 ; i <= cnt ; i++) {
    			intDiv = cnt / i;
    			intMod = cnt % i;
    			if (intDiv == intMod) {
    				ans += i;
    			}
    		}

       		System.out.println(ans);

            out.flush();


        } catch (IOException e) {

        }


    }


}