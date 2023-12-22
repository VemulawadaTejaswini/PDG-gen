import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int K = keyboard.nextInt();
		int A = keyboard.nextInt();
		int B = keyboard.nextInt();
		
		String ans ="NG"; 
		for(int x=A; x<=B; x++) {
			if(x%K == 0)
			ans = "OK";
		}
		
		System.out.println(ans);
		keyboard.close();
	}
}
