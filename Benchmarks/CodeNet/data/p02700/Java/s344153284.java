import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int aw = c-b;
		int t = a-d;
		if(t>0 || t>aw){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}