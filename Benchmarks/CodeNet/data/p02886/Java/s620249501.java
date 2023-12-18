import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), ans = 0;
		int b[] = new int[a];
		for(int i = 0; i < a; i++){			
			b[i] = sc.nextInt();
		}
		Arrays.sort(b);
		
		for(int i = 0; i < b.length-1; i++){
			for(int j = i + 1; j < b.length; j++){
				ans = ans + b[i] * b[j];
			}
		}
		
		
		
		
		
		System.out.println(ans);
		
	}
}