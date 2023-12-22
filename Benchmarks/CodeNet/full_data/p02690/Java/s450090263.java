import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int index = 0;
        long i5 = 0;
        long bi5 = 0;
        while (i5 <= X) {
        	i5 = (long) Math.pow(index, 5);
        	if (i5 == X) {
        		System.out.println(index + " " + 0);
        		System.exit(0);
        	}
        	index++;
        }
        for (int i = 1; i <= (i5 - X); i++) {
        	bi5 = (long) Math.pow(i, 5);
        	if (i5 - bi5 == X) {
        		System.out.println(index + " " + i);
        		System.exit(0);
        	} else if (i5 - bi5 < X) {
        		break;
        	}
        }
        long indexm = index - 2;
        long i5m = (long) Math.pow(indexm, 5);
        for (int i = -1; i < (X - indexm); i--) {
        	bi5 = (long) Math.pow(i, 5);
        	if (i5m - bi5 == X) {
        		System.out.println(indexm + " " + i);
        		System.exit(0);
        	} else if (X < i5m - bi5) {
        		break;
        	}
        }

    }
}