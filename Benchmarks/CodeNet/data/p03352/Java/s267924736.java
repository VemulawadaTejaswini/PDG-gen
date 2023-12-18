import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
	int b = 1;
	int p = 2;
	double max = 0;
	double result;
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
	while (b < 1000) {
	    while (p < 1000) {
		result = Math.pow(b, p);
		if (result > x ) break;
		if (result >= max) max = result;
		p++;
	    }
	    p = 2;
	    b++;
	}
	System.out.println((int)max);
    }
    
}
