import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		int n = scan.nextInt();
		
		long sum = 0;
		
		long cnt = 2;
		
		
		long a = scan.nextLong();
		
		if(a >= 2){
			sum += a - 1;
		}
		
		for(int i = 1 ; i < n ; i++){
			
			a = scan.nextLong();
			
			long b = a / cnt;
			
			
			if(cnt == a){
				cnt++;
				b = 0;
			} else if(a % cnt == 0){
				b--;
			}
			
			sum += b;
		}
		
		System.out.println(sum);
	}
}
