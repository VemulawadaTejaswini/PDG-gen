import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			String s = sc.next();
			int b = sc.nextInt();
			if(s.equals("?")) break;
			else if(s.equals("+")) System.out.println(a+b);
			else if(s.equals("-")) System.out.println(a-b);
			else if(s.equals("*")) System.out.println(a*b);
			else if(s.equals("/")) System.out.println(a/b);
		}
	}
}
