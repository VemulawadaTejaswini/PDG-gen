import java.io.InputStreamReader;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			
			int[] a = new int[N];
			
			for(int i = 0; i<N; i++){
				a[i] = scan.nextInt();
			}
			
			int ans = 0;
			
			for(int i = 1; i<=N; i++){
				if(a[a[i-1]-1] == i){
					ans++;
				}
			}
			

			System.out.println(ans/2);
		}
	}
}
