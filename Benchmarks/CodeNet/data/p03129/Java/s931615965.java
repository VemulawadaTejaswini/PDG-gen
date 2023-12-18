import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a != 0) {
		if(a / 2 + 1 < b) {
			System.out.println("NO");
		}else{
		    System.out.println("YES");
		}
		}else {
			System.out.println("NO");
		}
	}
}