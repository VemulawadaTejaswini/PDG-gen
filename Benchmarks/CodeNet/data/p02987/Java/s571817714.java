import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
 
 
public class Main {

	static long MOD = 1_000_000_007;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int N = Integer.parseInt(sc.next());
		//long L = Long.parseLong(sc.next());
		int INF = Integer.MAX_VALUE;
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();
		//int N = A.length;
		//int N = Integer.parseInt(sc.next());
		Set<Character> set = new HashSet();
		char c1=c[0];
		char c2='b';
		int count_c1 = 1;
		int count_c2 = 0;
		boolean flag = true;
		
		for(int i=1; i<4; i++){

			if(c2=='b' && c1!=c[i])c2 =c[i];
			if(c[i]!=c1 && c[i]!=c2)flag= false;
			if(c[i]==c1){
				count_c1++;
			}
			if(c[i]==c2){
				count_c2++;
			}
		}
		String ans = null;
		if(false){
			ans = "No";
		}else if(count_c1 == 2 && count_c2 == 2){
			ans = "Yes";
		}else{
			ans = "No";
		}
		
		System.out.println(ans);
		
	}
	static long lcm (long a, long b) {
		long temp;
		long c = a;
		c *= b;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return (c/b);
	}
}

