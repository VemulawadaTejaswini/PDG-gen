import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		do{
			n = stdIn.nextInt();
			if(n==0) break;
			int[] a = new int[n];
			for(int i=0; i<n; i++) a[i] = stdIn.nextInt();
			int max = a[0];
			
			for(int i=0; i<n; i++){
				for(int j=1; j<n-i; j++){
					int sum = 0;
					for(int k=i; k<=i+j; k++){
						sum += a[k];
					}
					if(sum > max) max = sum;
				}				
			}
			System.out.println(max);	
		} while(true);


	}

}