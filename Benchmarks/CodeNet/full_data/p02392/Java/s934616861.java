import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String[] strAry = str.split(" ");

	    int a = Integer.parseInt(strAry[0]);
	    int b = Integer.parseInt(strAry[1]);
	    int c = Integer.parseInt(strAry[2]);
        String ans = "";

        if(a < b && b < c) {

        	ans = "Yes";

        } else if (a < b) {

        	ans = "No";

        }

        System.out.println(ans);

	}
}