
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk;
		String str="";
		int S_ndn,A_ndn,B_ndn,C_ndn;
		int sum=0;
		S_ndn=6000; A_ndn=4000; B_ndn=3000; C_ndn=2000;
		int tmp1,tmp2;

		try {
			for(int i=0; i<4; i++) {
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");
				tmp1=Integer.parseInt(stk.nextToken());
				tmp2=Integer.parseInt(stk.nextToken());
				if(tmp1==1) {
					sum+=tmp2*S_ndn;
				}

				else if(tmp1==2) {
					sum+=tmp2*A_ndn;
				}

				else if(tmp1==3) {
					sum+=tmp2*B_ndn;
				}

				else if(tmp1==4) {
					sum+=tmp2*C_ndn;
				}
				System.out.println(sum);
				sum=0;
			}


		}catch(IOException e) {

		}
	}
}
