import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		for (; a <= b; a++) {
			StringBuilder sb = new StringBuilder(String.valueOf(a));
			if (sb.toString().equals(sb.reverse().toString())) {
				count++;
			}
		}
		System.out.println(count);
	}
}
