import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] k1=new int[2];
		int i=0;
		try {
			while(true) {
				str = bfr.readLine();
				if(str.length()>3) {
					stk=new StringTokenizer(str," ");
					while(stk.hasMoreTokens()) {
						k1[i]=Integer.parseInt(stk.nextToken());
						i++;
					}
					i=0;
					System.out.println(""+(k1[0]+k1[1])/2);
				}
				else {System.exit(0);}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
