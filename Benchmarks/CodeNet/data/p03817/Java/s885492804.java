import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 1 + x/11*2;
		if(x % 11 > 6)
			ans ++;
		System.out.println(ans);
	}

}