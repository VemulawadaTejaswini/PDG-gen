import java.io.IOException;
import java.util.Scanner;

public class Main {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long k = scan.nextInt();
		int[] nn = new int[n];
		int[] mm = new int[m];
		int cnt = 0;
		int ni = 0;
		int mi = 0;
		for(int i=0; i<n; i++){
			nn[i] = scan.nextInt();
		}
		for(int i=0; i<m; i++){
			mm[i] = scan.nextInt();
		}

		while(k>0){
			if(ni==nn.length && mi==mm.length){
				break;
			}else if(ni==nn.length){
				k -= mm[mi];
				mi++; 
			}else if(mi==mm.length) {
				k -= nn[ni];
				ni++;
			}else{
				if(nn[ni] < mm[mi]){
					k -= nn[ni];
					ni++;
				}else{
					k -= mm[mi];
					mi++;  
				}
			}
			if(k<0){
				break;
			}
			cnt++;

		}


		System.out.println(cnt);
	}
}