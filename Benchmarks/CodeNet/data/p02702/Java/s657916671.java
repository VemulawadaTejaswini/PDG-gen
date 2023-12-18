import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			String S = sc.next();
			
			char[] s = S.toCharArray();
			int[] snum = new int[s.length];
			long[] rem = new long[S.length()];
			long[] remS  = new long[S.length()];
			int[] n = new int[2020];
			
			

			for(int i=0;i<s.length;i++) {
				snum[i] = s[i] - '0';
			}
			
			for(int i=S.length()-1;i>=0;i--) {
				
				if(i==S.length()-1) {
					rem[i] = snum[i]%2019;
					remS[i]= rem[i];
					n[(int)remS[i]]++;
				}
				else {
					rem[i] = snum[i]*(long)Math.pow(10,S.length()-i-1)%2019;
					remS[i]=remS[i+1]+rem[i];
					n[(int)remS[i]%2019]++;
					
				}

			}
			
			
			
			int ret = 0;
			
			for(int i=0;i<2020;i++) {
				if(i==0) {
					ret+=n[i];
				}
				ret+=(n[i]*n[i]-1)/2;
			}
			
			System.out.println(ret);
			
			
	    }
				
	}
