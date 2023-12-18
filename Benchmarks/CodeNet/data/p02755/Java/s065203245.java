import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	double re = a / 0.08;
	if (b / 0.1 <= re) {
	    System.out.print((int)re);
	} else {
	    System.out.print(-1);
	}
	
    }
}
