import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		Arrays.sort(array);
		
		double ans = (array[0] + array[1]) / 2.0;
		for(int i = 2; i < n; i++)
			ans = (array[i] + ans) / 2.0;
		
		System.out.println(ans);
	}
}
