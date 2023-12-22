import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			
			for(int i=1;i<n;i++){
				b[i] = b[i-1] + a[i-1];
			}
			int sum = 0;
			for(int i=1;i<n;i++){
				sum += b[i];
			}
			
			System.out.println(sum);
		}
	}	
}