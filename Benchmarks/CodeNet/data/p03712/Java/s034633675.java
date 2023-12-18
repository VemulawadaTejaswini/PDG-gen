import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String [] a = new String[h];
		for(int n = 0;n < h;n++) {
			a[n] = sc.next();
		}
		for(int n = 0;n < w+2;n++) System.out.print("#");
			System.out.println("");
		for(int n = 0;n < h;n++) System.out.println("#" + a[n] + "#");
		for(int n = 0;n < w + 2;n++)System.out.print("#");
	}
}
