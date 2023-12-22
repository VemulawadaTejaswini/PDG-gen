import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while (scan.hasNext()) {
	    int count = 0;
	    int n = scan.nextInt();
	    int x = scan.nextInt();
	    if (n == 0 && x == 0) {
		break;
	    }
	    for (int i = 1; i < n - 1; i++) {
		if (i > x) {
		    break;
		}
		for (int j = i + 1; j < n; j++) {
		    if (j + i > x) {
			break;
		    }
		    for (int k = j + 1; k < n + 1; k++) {
			if (j + i + k > x) {
			    break;
			}
			if (j + i + k == x) {
			    count++;
			    break;
			}
		    }
		}
	    }
	    System.out.println(count);
	}
    }
}