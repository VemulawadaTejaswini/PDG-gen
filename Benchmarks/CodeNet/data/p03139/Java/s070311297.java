public class Main {
    public static void main (String args[]) {
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int max = 0;
        int min = -1;

        if (n >= a + b) {
        	min = 0;
        }

        if (a > b) {
        	max = b;
        	if (min == -1) {
        	    min = a - b;
        	}
        } else {

        	max = a;
        	if (min == -1) {
        	    min = b - a;
        	}
        }

        System.out.println(max + " " + min);
    }
}
