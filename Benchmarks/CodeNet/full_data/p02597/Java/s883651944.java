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
			execute17_1();
		}
		
		private static void execute17_1() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				String str = sc.next();
				
				char[] c = new char[n];
				
				for(int i=0; i<n;i++) {
					c[i] = str.charAt(i);
				}
				
				long ans=0;
				long pre=-1;
				while(ans!=pre) {
					pre=ans;
				for(int i=0; i<n-1;i++) {
					if(c[i]=='W' && c[i+1]=='R') {
						for(int j=n-1; j>i;j--) {
							if(c[j]=='R' && c[j-1]=='W') {
								if(i==j-1) {
									c[i]='R';
									ans++;
								} else {
									
								c[i]='R';
								c[j]='W';
								ans++;
								}
								break;
							}
						}
					}
				}
					
				}
				
				System.out.println(ans);
			}
		}
    }