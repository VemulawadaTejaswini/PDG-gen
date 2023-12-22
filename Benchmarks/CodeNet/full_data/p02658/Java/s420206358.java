import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N= keyboard.nextInt();
		long[] a = new long[N];
		
		for(int i =0; i<N; i++) {
			a[i] = keyboard.nextLong();			
		}
		Arrays.sort(a);
		
		long cons = 1000000000000000000L;
		long ans = 1 ;
		
		for(int j=0; j<N; j++) {
			if(a[j] !=0) {
				if(a[j]<=cons && a[j] <= cons/ans) {
					ans = ans*a[j];	
				}else {
					ans = -1;
					break;
				}
			}else{
				ans = 0;
				break;
			}
		}
		
		System.out.print(ans);
		keyboard.close();	
		
	}
}
