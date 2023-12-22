import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int res = 360/t;
		if(360 % t == 0) {
			System.out.println(res);
		}
		else {
			System.out.println(res+1);
		}
	}
}