import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = sc.nextInt();
		
		int ans = n % k;
		
		
		
		if (ans == 0){
			System.out.println(0);
		}
		else {
			System.out.println(1);
		}
	}
}

