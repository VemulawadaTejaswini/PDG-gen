import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws java.io.IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] ia;

		boolean hasnext = true;
		while(hasnext){
			ia = in.readLine().split(" ");
			int a = Integer.parseInt(ia[0]);
			char op = ia[1].charAt(0);
			int b = Integer.parseInt(ia[2]);
			switch(op){
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '*':
				System.out.println(a*b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '?':
				hasnext = false;
				break;
			}
		}
	}
}