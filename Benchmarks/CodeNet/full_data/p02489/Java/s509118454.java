import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int time = 1;
	int x;
	String[] a = new String[10];
	while (true) {
	    x = sc.nextInt();
	    if (x == 0) {
		break;
	    }
	    a[time-1] = "Case " + time + ": " + x;
	    time += 1;
	}
	for (int i = 0; i < a.length; i++) {
	    if (a[i] != null) {
		System.out.println(a[i]);
	    }
	}
    }
}