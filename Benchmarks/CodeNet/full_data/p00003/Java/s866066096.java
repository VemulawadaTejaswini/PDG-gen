import java.util.Scanner;
class Main {
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);

		int x, y, z;

		while(scan.hasNext()){
			x = scan.nextInt();
			y = scan.nextInt();
			z = scan.nextInt();

			if(x*x + y*y == z*z ||
			   x*x + z*z == y*y ||
			   z*z + y*y == x*x) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}