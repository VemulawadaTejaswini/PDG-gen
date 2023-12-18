import java.io.*;
import java.util.*;

public class cutting_plants {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String s[] = in.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int x = Integer.parseInt(s[2]);
		if(a+b >= x && a<x ) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}

	}

}