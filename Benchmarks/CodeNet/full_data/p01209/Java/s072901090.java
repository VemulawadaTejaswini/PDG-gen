import java.util.Scanner;

//!
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		int[] p = {2,3,5,7,11,13,17,19,23,29,31};
		for(;;){
			int n = sc.nextInt();
			char[] s = sc.next().toCharArray();
			if(n==0)break;
			long X = 0;
			for(char c:s){
				long x = 'A'<=c?(c-'A'+10):(c-'0');
				X = X*n+x;
			}
			long[] need = new long[11];
			int N = n;
			for(int i=0;i<11;i++){
				if(N%p[i]==0){
					N/=p[i];
					need[i--]++;
				}
			}
			long[] num = new long[11];
			for(int i=0;i<11;i++){
				long x = X;
				while(x>1){
					num[i]+=x/p[i];
					x/=p[i];
				}
			}
			long res = 1L<<60;
			for(int i=0;i<11;i++)if(0<need[i])res=Math.min(res, num[i]/need[i]);
			StringBuffer sb = new StringBuffer("");
			while(res>0){
				long x = res%n;
				sb.append(10<=x?(char)(x-10+'A'):x);
				res/=n;
			}
			if(sb.length()==0)sb.append(0);
			System.out.println(sb.reverse());
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}