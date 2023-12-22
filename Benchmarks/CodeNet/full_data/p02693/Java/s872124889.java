import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean find = false;
		for(int i = a; i <= b; i++) {
			if(i % k == 0) {
				System.out.println("OK");
				find = true;
				break;
			}
		}
		if(!find)
			System.out.println("NG");
    }
}