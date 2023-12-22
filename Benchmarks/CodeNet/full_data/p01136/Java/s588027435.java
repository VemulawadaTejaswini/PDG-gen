import java.util.*;

class Main {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n==0) return ;
			int ans = -1;
			long masks[] = new long[n];
			long frees[] = new long [30];
			for(int i=0; i<n; i++){
				int f = in.nextInt();
				for(int j=0; j<f; j++){
					frees[in.nextInt()-1] |= 1L<<i;
				}
			}
			for(int i=0; i<n; i++) masks[i] |= 1L<<i;
			for(int i=0; i<30; i++){
				long mask=0;
				for(int j=0; j<n; j++)if((frees[i] & (1L<<j)) > 0){
					mask |= masks[j];
				}
				if(Long.bitCount(mask)==n){
					ans = i+1;
					break;
				}
				for(int j=0; j<n; j++)if((frees[i] & (1L<<j)) > 0){
					masks[j] |= mask;
				}
			}
			System.out.println(ans);
		}
	}
	
}