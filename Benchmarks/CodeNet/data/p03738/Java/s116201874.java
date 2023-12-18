import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x > y) {
			System.out.println("GREATER");
		}else if(x < y) {
			System.out.println("LESS");
		}else if(x == y) {
			System.out.println("EQUAL");
		}
	}
}

