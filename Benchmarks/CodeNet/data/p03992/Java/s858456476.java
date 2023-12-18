import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		// output
		System.out.println(a.substring(0,4)+ " " + a.substring(4,12));
	}
}