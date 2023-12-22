public class Main{
    public static int CUBIC = 3;
    public static void main(String[] args) {
	String a = args[0];
	int x = Integer.parseInt(a);
	if (x == 1 || x == 0) {
	    System.out.println(x);
	}
	int xcubic = 1;
	for (int i = 0; i < CUBIC; i++) {
	    xcubic *= x;
	}
	System.out.println(xcubic);
    }
}