import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute14_2();
	}

	private static void execute14_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int [] a = new int[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextInt();
			}
			
			int ans =0;
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(j-i==a[i]+a[j]) ans++;
				}
			}
			System.out.println(ans);
		}

	}
}