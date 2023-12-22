public class Main {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String a1 = scan.next();
		String a2 = scan.next();
		String a3 = scan.next();
	    int x = Integer.parseInt(a1);
	   	int y = Integer.parseInt(a2);
	   	int z = Integer.parseInt(a3);
	   	if (x > y) {
	   		if (y > z)
	   			System.out.println(z + " " + y + " " + x);
	   		else if (z > x)
	   			System.out.println(y + " " + x + " " + z);
	   		else
	   			System.out.println(y + " " + z + " " + x);
	   	} else {
	   		if (x > z)
	   			System.out.println(z + " " + x + " " + y);
	   		else if (z > y)
	   			System.out.println(x + " " + y + " " + z);
	   		else
	   			System.out.println(x + " " + z + " " + y);
	   	} 
	}

}