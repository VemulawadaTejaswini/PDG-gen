import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) a[i] = sc.nextInt();
		Arrays.sort(a);
		
		System.out.println(Math.abs(a[2]-a[1]) + Math.abs(a[1]-a[0]));
	}
}