import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		String s= new String();
		if((x+r)<=W &&(y+r)<=H) {
			s="Yes";
		} else {
			s="No";
		}
		System.out.println(s);
	}
}