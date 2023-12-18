import java.util.*;
public class Main {
	public static void main(String[] args) {
		long ans = 1;
		for(int i = 0; i < (int) (Math.log(new Scanner(System.in).nextLong()) / Math.log(2)) + 1; i++)
			ans *= 2;
		System.out.println(ans-1);
	}
}