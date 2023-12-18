import java.util.*;

public class Main {

	public static void main(String[] args){
		// input
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = s.nextInt();
		}
		
		//error
		int[] b = a.clone();
		Arrays.sort(b);
		for(int i = n - 1; i > 0; i -= 2){
			if(b[i] == b[i-1]){
				//System.out.println(b[i]);

			}else{
				System.out.println("0");
				System.exit(0);
			}
		}
		
		//System.out.println("-------------");
		//
		if( n % 2 == 0 ){
			//System.out.println("a");
			System.out.println((2<<(n / 2 - 1)) % (10 ^ 9 + 7));
		}else{
			//System.out.println("b: "));
			System.out.println((2<<((n - 1) / 2) - 1) % (10 ^ 9 + 7));
		}
	}
}
