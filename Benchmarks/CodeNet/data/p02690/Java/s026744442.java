import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int index = -1;
        long i5 = 0;
        long bi5 = 0;
        while (i5 <= X) {
        	index++;
        	i5 = (long) Math.pow(index, 5);
        	if (i5 == X) {
        		System.out.println(index + " " + 0);
        		System.exit(0);
        	}
        }
        for (int i = 0;; i++) {
        	bi5 = (long) Math.pow(i, 5);
        	if (i5 - bi5 == X) {
        		System.out.println(index + " " + i);
        		System.exit(0);
        	} else if (i5 - bi5 < X) {
        		while (0 < index) {
        			index--;
        			i5 = (long) Math.pow(index, 5);
        			for (int j = 0;;j--) {
            			bi5 = (long) Math.pow(j, 5);
                    	if (i5 - bi5 == X) {
                    		System.out.println(index + " " + j);
                    		System.exit(0);
                    	} else if (X < i5 - bi5) {
                    		break;
                    	}
        			}
        		}
        	}
        }
    }
}