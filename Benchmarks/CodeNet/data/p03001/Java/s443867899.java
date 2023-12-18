import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int w = sc.nextInt();
	int h = sc.nextInt();
	int x = sc.nextInt();
	int y = sc.nextInt();
	if (w <= h) {
	    if (x * 2 <= w) System.out.printf("%.7f",(double)(x * h));
	    else { System.out.printf("%.7f",(double)((w-x) * h)); }
	    if (w == h && x * 2 == w) System.out.print(" " + 1);
	    else { System.out.print(" " + 0); }
	} else {
	    if (y * 2 <= h) System.out.printf("%.7f",(double)(y * w));
	    else { System.out.printf("%.6f",(double)((h-y) * w)); }
	    System.out.print(" " + 0);
	}
    }
}
