import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s=input.next();
		String t=input.next();
		int a=input.nextInt();
		int b=input.nextInt();
		String u=input.next();
		if (u==s) {
			a=a-1;
		}else {
			b=b-1;
		}
		System.out.print(a+" ");
		System.out.println(b);
	}
}
