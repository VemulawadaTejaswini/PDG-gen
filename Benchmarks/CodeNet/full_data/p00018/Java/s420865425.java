import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] go=new int[5];
		String aa="";

		try {
			str=bfr.readLine();
			stk=new StringTokenizer(str," ");

			for(int i=0; i<5; i++) {
				go[i]=Integer.parseInt(stk.nextToken());
			}
			go=Bubble(go);
			for(int i=4; i>=0; i--) {
				aa=aa+go[i]+" ";
			}
			System.out.println(aa);

		}catch(IOException e) {

		}
	}

	static int[] Bubble(int[] a) {
		int tmp1,tmp2=0;
		int ookisa=a.length;

		for(int i=0; i<ookisa-1; i++) {
			for(int j=ookisa-1; j>=i+1; j--) {
				if(a[j]<a[j-1]) {
					tmp1=a[j];
					tmp2=a[j-1];
					a[j]=tmp2;
					a[j-1]=tmp1;
				}
			}
		}

		return a;
	}
}
