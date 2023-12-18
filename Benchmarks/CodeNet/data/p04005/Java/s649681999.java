import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;


public class twins {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		
		long a = s.nextLong(), b = s.nextLong(), c = s.nextLong();
		long perThing = a*b;
		if(c%2 == 0) {
			System.out.println(0);
		} else {
			long blue = perThing * (c/2);
			long red = (c - (c/2)) * perThing;
//			System.out.println(blue + " " + red);
			System.out.println(Math.abs(red-blue));
		}
	}
}