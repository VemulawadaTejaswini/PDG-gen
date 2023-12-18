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

    		int intR = Integer.parseInt(strDat[0]);
    		int intD = Integer.parseInt(strDat[1]);
    		int intX = Integer.parseInt(strDat[2]);

//    		System.out.println(intR );
//    		System.out.println(intD );
//    		System.out.println(intX );

    		int x =intX;

    		for (int y = 2000 ; y < 2010 ; y++) {
    			x = intR * x - intD;
        		System.out.println(x );
    		}




    		out.flush();


        } catch (IOException e) {

        }


    }


}