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
		execute15_1();
	}
	
	private static void execute15_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int [] a = new int[n];
			int max = 1000009;
			
			int[] cannt = new int[max];
			
			for(int i=0;i<max;i++) {
				cannt[i]=0;
			}
			for(int i=0; i<n; i++) {
				 a[i] = sc.nextInt();
				int c = 1;
				while(a[i]*c<max) {
					cannt[a[i]*c]++;
					c++;
				}
			}
			
			int ans =n;
			
			for(int i=0; i<n; i++) {
				if(cannt[a[i]]>0) {
					if(cannt[a[i]]==1) continue;
					ans--;
				}
			}
			
			System.out.println(ans);
		}

	}
}