import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Math math = new Math();

        int X = scan.nextInt();

        int A = 0;
        int b;

        while (true) {
        	int B_five = A*A*A*A*A - X;
        	if (B_five > 0) {
        		b = 1;
        		while (b*b*b*b*b < B_five) {
        			b++;
        		}
        		if (B_five - b*b*b*b*b == 0) {
        			break;
        		}
        	} else if (B_five < 0) {
        		b = -1;
        		while (b*b*b*b*b > B_five) {
        			b--;
        		}
        		if (B_five - b*b*b*b*b == 0) {
        			break;
        		}
        	} else if (B_five == 0) {
        		b = 0;
        		break;
        	}
        	A++;
        }

		System.out.println(A+" "+b);

	}
}