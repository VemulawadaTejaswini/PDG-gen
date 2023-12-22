public class Main {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
	    int aa = Integer.parseInt(a);
	   	int bb = Integer.parseInt(b);
	   	if (aa < bb) {
	   		System.out.println("a < b");
	   	} else if (aa == bb) {
	   		System.out.println("a = b");
	   	} else if (aa > bb) {
	   		System.out.println("a > b");
	   	}

	}

}