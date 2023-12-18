import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] U = new long[n];
		long[] V = new long[n];
		for(int i=0;i<n;i++) {
			long x = in.nextLong();
			long y = in.nextLong();
			U[i] = x + y + (1L<<31);
			V[i] = x - y + (1L<<31);
		}
		in.close();
		long mod2 = U[0] % 2;
		boolean sameMod = true;
		for(int i=1;i<n;i++) {
			if(U[i]%2!=mod2) {
				sameMod = false;
				break;
			}
		}
		if(sameMod) {
			if(mod2==1) {
				long[] d = new long[31];
				System.out.println(31);
				
				String arms = "";
				for(int i=0;i<31;i++) {
					d[i] = 1L<<i;
					arms += d[i];
					arms += " ";
				}
				System.out.println(arms);
				
				for(int i=0;i<n;i++) {
					U[i] = (U[i] - 1)/2;
					V[i] = (V[i] - 1)/2;
					
					String ans = "";
					for(int j=0;j<31;j++) {
						long u = (U[i]>>j)&1;
						long v = (V[i]>>j)&1;
						if(u==1 && v==1) ans += "R";
						else if(u==0 && v==1) ans += "D";
						else if(u==1 && v==0) ans += "U";
						else if(u==0 && v==0) ans += "L";
					}
					System.out.println(ans);
				}
			}else {
				long[] d = new long[31];
				System.out.println(32);
				
				String arms = "";
				for(int i=0;i<31;i++) {
					d[i] = 1L<<i;
					arms += d[i];
					arms += " ";
				}
				arms += "1";
				System.out.println(arms);
				
				for(int i=0;i<n;i++) {
					U[i] = U[i]/2;
					V[i] = V[i]/2;
					
					String ans = "";
					for(int j=0;j<31;j++) {
						long u = (U[i]>>j)&1;
						long v = (V[i]>>j)&1;
						if(u==1 && v==1) ans += "R";
						else if(u==0 && v==1) ans += "D";
						else if(u==1 && v==0) ans += "U";
						else if(u==0 && v==0) ans += "L";
					}
					ans += "L";
					System.out.println(ans);
				}
			}
			
		}else {
			System.out.println(-1);
		}

	}

}
