    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String a = sc.next();
    	    String b = sc.next();
    	    String c = sc.next();

    	    String x = a.substring(0, 1);
    	    String y = b.substring(0, 1);
    	    String z = c.substring(0, 1);

    	    x=x.toUpperCase();
    	    y=y.toUpperCase();
    	    z=z.toUpperCase();
    	    System.out.print(x);
    	    System.out.print(y);
    	    System.out.print(z);

    	}
    }