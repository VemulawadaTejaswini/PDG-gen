import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main (String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int omosa=0;
		int[] omori=new int[10];
		int[] o_uuum=new int[10];
		int p=1;
		String mj="";
		String iru="";
		for(int i=0; i<10; i++) {
			omori[i]=p;
			o_uuum[i]=0;
			p*=2;
		}
		try {
			while(true) {
				mj=bfr.readLine();
				omosa=Integer.parseInt(mj);
				for(int i=0; i<10; i++) {
					o_uuum[i]+=omosa%2;
					omosa=omosa>>1;
					if(o_uuum[i]==1) {
						iru=iru+""+omori[i]+" ";
					}
					else {}
				}
				System.out.println(iru);
				for(int i=0; i<10; i++) {
					o_uuum[i]=0;
				}
				iru="";
			}
		}catch(IOException e) {
		}
	}
}
