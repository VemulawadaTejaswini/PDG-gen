import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	    int b = sc.nextInt(); 
	    if(a%b == 0) System.out.println(a+b);
	    else System.out.println(b-a);
	}
}