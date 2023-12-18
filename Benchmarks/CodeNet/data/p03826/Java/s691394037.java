import java.util.*;
public class Main {
	public static void main(String[] args){
		// get numbers
		Scanner sc = new Scanner(System.in);     
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int x = 0, y = 0;

        x = a * b;
        y = c * d;

        if (x >= y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        sc.close();
	}
}