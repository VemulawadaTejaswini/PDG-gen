import java.lang.Math.*;
import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int x = scan.nextInt();
		int out = (int) Math.pow(x, 3);
		System.out.println(out);
	}
}