import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(Cube(a));
		int b = s.nextInt();
		System.out.println(Cube(b));
		int c = s.nextInt();
		System.out.println(Cube(c));
		int d = s.nextInt();
		System.out.println(Cube(d));
	}

	public static int Cube(int x){
		int ans = 1;
		for(int i = 0; i < 3; i++){
			ans *= x;
		}
		return ans;
	}
}