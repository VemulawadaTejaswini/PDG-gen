	import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if (x <y && y < z){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}