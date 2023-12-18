import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int a = 0;
		int i = 0;
		for( i = 0;;i++) {
			a = y * i + z * (i + 1);
			if(a > x)break;
		}
		System.out.println(i - 1);
	}
}