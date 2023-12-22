import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer stk;
		int k1,k2;
		try {
			while(true) {
				str = (bfr.readLine())+" ";
				stk=new StringTokenizer(str," ");
				k1=Integer.parseInt(stk.nextToken());
				k2=Integer.parseInt(stk.nextToken());
				System.out.println(""+(k1+k2)/2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
