import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = "No";

		while(N > 0){
			int d = N % 10;
			N = N / 10;
			if(d == 7)
			s = "Yes";
			break;
		}

		System.out.println(s);
		
	}
}