
import java.util.*;
import java.io.*;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		
		boolean flag = false;
		if(k < Math.abs(a-b) ) flag = true;
		if(k < Math.abs(a-c) ) flag = true;
		if(k < Math.abs(a-d) ) flag = true;
		if(k < Math.abs(a-e) ) flag = true;
		if(k < Math.abs(b-c) ) flag = true;
		if(k < Math.abs(b-d) ) flag = true;
		if(k < Math.abs(b-e) ) flag = true;
		if(k < Math.abs(c-d) ) flag = true;
		if(k < Math.abs(c-e) ) flag = true;
		if(k < Math.abs(d-e) ) flag = true;
		
		if(flag==false) System.out.println("Yay!");
		else System.out.println(":(");
	}
}
