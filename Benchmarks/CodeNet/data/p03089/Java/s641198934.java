import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {  
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = input.nextInt();
		boolean bad=false;
		for (int i = 1; i <= N; i++) {
			int x = input.nextInt();
			arr.add(x);
			if (x>i) bad=true;
		}
		if (!bad) {
			int[] ans = new int[N];
			int cur = N-1;
			while (arr.size()>0) {
				int index = -1;
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i)==i+1) index = i;
				}
				ans[cur] = arr.get(index);
				cur--;
				arr.remove(index);
			}
			for (int i = 0; i < N; i++) {
				System.out.println(ans[i]);
			}
			
		}else System.out.println(-1);
	}	
}