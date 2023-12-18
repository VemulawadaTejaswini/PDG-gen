import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(), r = 0, b = 0;
		for (int i = 0; i < N; i++){
			String S = s.next();
			if(S.equals("R")) r++;
			else b++;
		}
		if (r > b)System.out.println("Yes");
		else System.out.println("No");
	}
}