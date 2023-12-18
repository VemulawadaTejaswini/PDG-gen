import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class Main{
	public static void main(final String[] args){
		final Scanner sc = new Scanner(System.in);
		// �����̓���
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		final int h[] = new int[n];
		final ArrayList<Integer> highest = new ArrayList<>();
		final ArrayList<Integer> sameh = new ArrayList<>();
		for(int i = 0; i < n; i++){
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < m; i++){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int ah = h[a-1];
			final int bh = h[b-1];
            if(ah > bh){
			    highest.add(b);
			}else if(ah < bh) {
				highest.add(a);
			}else{
				sameh.add(a);
				sameh.add(b);
			}
		}
		highest.addAll(sameh);
		final List<Integer> result = new ArrayList<Integer>(new HashSet<>(highest));
		System.out.println(n - result.size());
	}
}
