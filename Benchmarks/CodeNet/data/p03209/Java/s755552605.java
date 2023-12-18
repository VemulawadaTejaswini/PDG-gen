import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long B = sc.nextLong();
		
		long ans = 0;
			long b = B;
			while(true){
				if(b!=B) ans++;
				b--;
				if(b==0) break;

				long t = 1;
				for(int n=1;n<N;n++){
					long pt = t;
					t = 2*t+3;
					if(b<=t){
						t = pt;
						break;
					}
					
				}
				ans += (long)((t+1)/2)-1;
				b -= t;
				if(b==0) break;
			}
			System.out.println(ans);
		
	}
}