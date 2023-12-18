import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n + 1]; 
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextInt();
		    q[p[i]] = i + 1;
		}
		
		// 計算
		int result = 0;
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(-1);
		ts.add(0);
		ts.add(n + 1);
		ts.add(n + 2);
		ts.add(q[n]);
		for(int i = n - 1; i >= 1; i--){
		    // l2 l1 x h1 h2
		    int x = q[i];
		    int h1 = (int)ts.higher(x);
		    int h2 = (int)ts.higher(h1);
		    if(h2 == n + 2) h2--;
		    int l1 = (int)ts.lower(x);
		    int l2 = (int)ts.lower(l1);
		    if(l2 == -1) l2++;
		    result = result + ((h1 - x)*(l1 - l2) + (h2 - h1)*(x - l1)) * i;
		    ts.add(x);
		}
		
		// 出力
		System.out.println(result);
	}
}
