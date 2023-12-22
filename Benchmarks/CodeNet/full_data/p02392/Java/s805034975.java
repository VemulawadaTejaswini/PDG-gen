import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a < b){
			if (b < c){
				System.out.print("YES");
			} else {
				System.out.print("NO");
			}
		} else {
			System.out.print("NO");
		}
	}
}