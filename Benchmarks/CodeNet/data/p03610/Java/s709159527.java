import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.nextLine().toCharArray();
		for (int i = 0; i<arr.length; i=i+2)
			System.out.print(arr[i]);
	}
}
