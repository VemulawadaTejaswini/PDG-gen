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
        	int B_five = (int)Math.pow(A,5) - X;
        	if (B_five > 0) {
        		b = 1;
        		while (Math.pow(b,5) < B_five) {
        			b++;
        		}
        		if (B_five - Math.pow(b,5) == 0) {
        			break;
        		}
        	} else if (B_five < 0) {
        		b = -1;
        		while (Math.pow(b,5) > B_five) {
        			b--;
        		}
        		if (B_five - Math.pow(b,5) == 0) {
        			break;
        		}
        	} else if (B_five == 0) {
        		b = 0;
        	}
        	A++;
        }

		System.out.println(A+" "+b);

	}
}