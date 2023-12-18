import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int h[] = new int[n];
		ArrayList<Integer> highest = new ArrayList<>();
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ah = h[a-1];
			int bh = h[b-1];
            if(ah > bh){
			    highest.add(b);
			}else{
				highest.add(a);
			}
		}
		List<Integer> result = new ArrayList<Integer>(new HashSet<>(highest));
		System.out.println(n - result.size());
	}
}
