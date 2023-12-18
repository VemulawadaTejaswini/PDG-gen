import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();		
		boolean ans = false;
		
		if(N % 7 == 0 || N % 4 == 0){
			ans = true;
		}
		
		for(int a = 0 ; a < N ; a += 7){
			if((N - a) % 4 == 0){
				ans = true;
				break;
			}
		}		
		System.out.println(ans ? "Yes" : "No");		
	}
}