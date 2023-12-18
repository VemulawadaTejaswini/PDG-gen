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


    		String strInfo = br.readLine();
    		String strData = br.readLine();

    		String strInf[] = strInfo.split(" ", -1);

    		StringBuffer ans = new StringBuffer();

    		for (int i = 0 ; i < strData.length() ; i++) {
    			if (i+1 == Integer.parseInt(strInf[1])) {
        			ans = ans.append( (strData.charAt(i)+"").toLowerCase() );
    			}else {
        			ans = ans.append(strData.charAt(i));

    			}
    		}

    		System.out.print(ans.toString());
            out.flush();


        } catch (IOException e) {

        }


    }


}