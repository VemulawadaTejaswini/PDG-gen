import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
 
public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		int[] b = new int[m];
		boolean[] searched = new boolean[n+1];
		for(int i= 0; i < m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < n + 1; i++) {
			searched[i] = false;
		}
		int ans = 0;
		Queue<Integer> friend = new ArrayDeque<>();
		//aとbのソート
		int[][] ab = new int[a.length][2];
		int[][] ba= new int[a.length][2];
		for(int i = 0; i < a.length; i++) {
			ab[i][0] = a[i];
			ab[i][1] = b[i];
			ba[i][0] = b[i];
			ba[i][1] = a[i];
		}
		Arrays.sort(ab, (x,y) -> Integer.compare(x[0], y[0]));
		Arrays.sort(ba, (x,y) -> Integer.compare(x[0], y[0]));
		friend.add(ab[0][0]);
		
		

		int sum = 0;
		label: while(true) {
			if(m == 0) {
				ans = 1;
				break;
			}
			//System.out.println(1);
			cnt = 0;
			search(friend.poll(), ab,ba, searched, friend);
			//System.out.println(cnt);
			if(ans < cnt) {
				ans = cnt;
			}
			for(int i = 0; i < ab.length; i++) {
				if(searched[ab[m-1-i][0]] == false) {
					friend.add(ab[m-1-i][0]);
					continue label;
				}else if(searched[ba[m-1-i][0]] == false) {
					friend.add(ba[m-1-i][0]);
					continue label;
				}
			}
			break;
			/*System.out.println(cnt);
			sum += cnt;
			if(sum >= n) {
				break label;
			}*/
		}
		System.out.println(ans);
		
	}
	
	
	
	public static void search(int root,int[][] ab,int[][] ba,boolean[] searched,Queue<Integer> friend) {
		searched[root] = true;
		++cnt;
		//System.out.println(root+" "+searched[root]);
		for(int i = 0; i < ab.length; ++i) {
			if(root > ab[i][0]) {break;}
			if(ab[i][0] == root && searched[ab[i][1]] == false) {
				friend.add(ab[i][1]);
				searched[ab[i][1]] = true;
			}
		}
		for(int i = 0; i < ba.length; ++i) {
			if(root > ba[i][0]) {break;}
			if(ba[i][0] == root && searched[ba[i][1]] == false) {
				friend.add(ba[i][1]);
				searched[ba[i][1]] = true;
			}
		}
		if(friend.peek() != null) {
			search(friend.poll(),ab,ba,searched,friend);
		}
		
	}
	
	
	/*public static void search(int root,int[] a,int[] b,boolean[] searched,Queue<Integer> friend) {
		//System.out.println(root);
		searched[root] = true;
		++cnt;
		for(int i = 0; i < a.length; ++i) {
			if(a[i] == root && searched[b[i]] == false) {
				friend.add(b[i]);
				searched[b[i]] = true;
			}else if(b[i] == root && searched[a[i]] == false) {
				friend.add(a[i]);
				searched[a[i]] = true;
			}
		}
		if(friend.peek() != null) {
			search(friend.poll(),a,b,searched,friend);
		}
	}*/
}