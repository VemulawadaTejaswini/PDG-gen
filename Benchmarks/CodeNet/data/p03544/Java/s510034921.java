public class Main {
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
	    long l0 = 2;
	    long l1 = 1;
	    if (n == 1) {
	    	System.out.println(l1);
	    }
	    long l2 = l1 + l0;
	    if (n == 2) {
	    	System.out.println(l2);
	    }
	    for (int i = 2; i < n; i++) {
	    	long next = l2 + l1;
	    	l0 = l1;
	    	l1 = l2;
	    	l2 = next;
	    }
	    System.out.println(l2);
	}

}