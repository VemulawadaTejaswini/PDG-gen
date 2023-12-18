import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int num = 1;
		int ans = 0;
		
		while (true) {
			ans++;
			num = num - 1 + a;
			if (num >= b) break; 
		}
		
		System.out.println(ans);
	}

}
