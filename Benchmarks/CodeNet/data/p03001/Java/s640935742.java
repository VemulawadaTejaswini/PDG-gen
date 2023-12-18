import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double W = sc.nextInt();
		double H = sc.nextInt();      
		int x = sc.nextInt();
		int y = sc.nextInt();

      	double a = W * H / 2;
      
      	double x1 = W / 2;
      	double y1 = H / 2;
      
      	int z = x1 == x && y1 == y ? 1 : 0;

        System.out.println(a + " " + z);
	}
}