import java.util.Scanner;

public class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int p[] = new int[n];
		for(int i = 0; i < n; i++){
			p[i] = scan.nextInt();
		}
		int ans = 0;
		int min = n + 1;
		
		for(int i = 0; i < n; i++){
			if(min > p[i]){
				min = p[i];
				ans++;
			}
				
		}	
		System.out.println(ans);
	}
}