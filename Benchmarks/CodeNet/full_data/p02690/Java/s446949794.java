import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        long X = scan.nextInt();

        long A = 0;
        long b;

        while (true) {
        	long Bfive = A*A*A*A*A - X;

        	if (Bfive < 0) {
        		b = -1;
        		while (b*b*b*b*b > Bfive) {
        			b--;
        		}
        		if (b*b*b*b*b == Bfive) {
        			break;
        		}

        	} else if (Bfive > 0) {
        		b = 1;
        		while (b*b*b*b*b < Bfive) {
        			b++;
        		}
        		if (b*b*b*b*b == Bfive) {
        			break;
        		}

        	} else if (Bfive == 0) {
        		b = 0;
        		break;
        	}

        	A++;
        }

		System.out.println(A+" "+b);

	}
}