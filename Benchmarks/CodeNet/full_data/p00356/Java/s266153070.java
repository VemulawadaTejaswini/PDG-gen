import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String args[]) {

		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;

		int x_kazu,y_kazu=0;

		try {
			str=bfr.readLine();
			if(str=="") {
				System.exit(0);
			}
			stk=new StringTokenizer(str," ");
			x_kazu=Integer.parseInt(stk.nextToken());
			y_kazu=Integer.parseInt(stk.nextToken());

			int gcm=0;

			for(int i=1; i<=Math.min(x_kazu,y_kazu); i++) {
				if(x_kazu%i==0 && y_kazu%i==0) {
					gcm=i;
				}
			}

			int res=((x_kazu/gcm)+(y_kazu/gcm)-1)*gcm+1;
			System.out.println(res);

		}catch(IOException e) {

		}
	}
}


