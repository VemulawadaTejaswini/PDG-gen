import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int Q = in.nextInt();
		
		
		
		System.out.println(count(N, Q));
		//System.out.println(count_tu(N, Q));
		
		

	}
	
	public static long count(int N, int Q) {
		
		long ans=0;
		int t;
		if (Q%2==0) {
			int P = Q/2;
			t=N/P;
			if (t%2==0) {
				ans=(t/2)*(t/2)*(t/2)*2;
			}else {
				ans=(t/2)*(t/2)*(t/2) + ((t/2)+1)*((t/2)+1)*((t/2)+1);
			}
			
		} else {
			t=N/Q;
			ans = t*t*t;
			
		}
		
		return ans;
	}
	
	public static long count_tu(int N, int Q) {
		
		long ans = 0;
		
		if (Q%2==0) {
			int P = Q/2;
			for (int i=P;i<=N;i+=P) {
				for (int j=P;j<=N;j+=P) {
					if ((i+j)%Q != 0)
						continue;
					else {				
						for (int k=P;k<=N;k+=P) {
							
							if ((k+j)%Q != 0||(k+i)%Q != 0)
								continue;
							else {
							
								ans++;
								System.out.println(i + " " + j + " " + k);
							
							}
						}
					}
				}
			}
		} else {
			for (int i=Q;i<=N;i+=Q) {
				for (int j=Q;j<=N;j+=Q) {
					if ((i+j)%Q != 0)
						continue;
					else {				
						for (int k=Q;k<=N;k+=Q) {
							
							if ((k+j)%Q != 0||(k+i)%Q != 0)
								continue;
							else {
							
								ans++;
								System.out.println(i + " " + j + " " + k);
							
							}
						}
					}
				}
			}
			
		}
		return ans;
	}

}
