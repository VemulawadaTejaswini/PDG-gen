import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		 int dec = sc.nextInt();
 	 	 int n = sc.nextInt();
 	 	String base36 = Integer.toString(dec, n);
		System.out.println(base36.length());





	}
}
