import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long ans = 0;
		if(N==2){
			ans = a[0] - a[1];
		}else{
			for(int i=0; i<N; i++){
				a[i] = Math.abs(a[i]);
			}
			Arrays.sort(a);	
			for(int i=N-1; i>=0; i--){
				if(Math.abs(ans+a[i]) > Math.abs(ans-a[i])){
					ans = ans-a[i];
				}else{
					ans = ans+a[i];
				}
			}	
		}
		System.out.println(Math.abs(ans));

	}

}
