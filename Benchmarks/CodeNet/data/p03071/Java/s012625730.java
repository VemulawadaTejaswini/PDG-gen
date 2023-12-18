
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String msg = "No";
		int A = sc.nextInt();
		int  B = sc.nextInt();
		int count = 0;
		if (A > B) {
			count = A;
			A--;
		}else {
				count = B;
				B--;
		}
		if (A > B) {
			count += A;
		}else {
				count += B;
		}
//		System.out.println(msg);
		System.out.println(count);
	}
}