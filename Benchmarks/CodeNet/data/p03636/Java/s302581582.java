import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		int len = arr.length;
		System.out.print(arr[0]);
		System.out.print(len-2);
		System.out.print(arr[len-1]);
      	System.out.println();
	}
}
