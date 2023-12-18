public class Main {
	public static void main(String[] args) {
	    java.util.Scanner scanner = new java.util.Scanner(System.in);
	    int n = scanner.nextInt();
	    int a = n / 1000;
	    int b = (n - a * 1000) / 100;
	    int c = (n - a * 1000 - b * 100) / 10;
	    int d = n - a * 1000 - b * 100 - c * 10;
	    
	    if (a+b+c+d == 7) {
	    	System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
	    } else if (a+b+c-d == 7) {
	    	System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
	    } else if (a+b-c+d == 7) {
	    	System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
	    } else if (a-b-c+d == 7) {
	    	System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
	    } else if (a+b-c-d == 7) {
	    	System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
	    } else if (a-b+c-d == 7) {
	    	System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
	    } else if (a-b-c-d == 7) {
	    	System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
	    } 
	}

}
