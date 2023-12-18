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
		if(aw>=t && aw>=0){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}