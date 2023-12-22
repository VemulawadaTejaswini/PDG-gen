import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		StringTokenizer stk;
		int[] suji1,suji2;
		suji1=new int[4];
		suji2=new int[4];
		int hits=0;
		int blow=0;
		while(true) {
			try {
				hits=0;
				blow=0;
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");
				for(int i=0; i<4; i++) {
					suji1[i]=Integer.parseInt(stk.nextToken());
				}
				str=bfr.readLine();
				stk=new StringTokenizer(str," ");
				for(int i=0; i<4; i++) {
					suji2[i]=Integer.parseInt(stk.nextToken());
				}

				for(int i=0; i<4; i++) {
					if(suji1[i]==suji2[i]) {
						hits++;
					}
				}
				suji1=Bubble(suji1);
				suji2=Bubble(suji2);

				for(int i=0; i<4; i++) {
					if(suji1[i]==suji2[i]) {
						blow++;
					}
				}

				System.out.println(hits+" "+(blow-hits));
			}catch(IOException e) {

			}
			catch(NullPointerException e) {
			    System.exit(0);
			}
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
