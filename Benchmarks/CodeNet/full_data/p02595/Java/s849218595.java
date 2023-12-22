	import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
	
	public class Main {
	
		public static void main(String[] args) {
			execute17_3();
		}
		
		private static void execute17_3() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				int d = sc.nextInt();
				
				int ans=0;
				for(int i=0; i<n;i++) {
					int a = sc.nextInt();
					int b = sc.nextInt();
					if(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) <= d) {
						ans++;
					}
				}
				System.out.println(ans);
			}
		}
    }