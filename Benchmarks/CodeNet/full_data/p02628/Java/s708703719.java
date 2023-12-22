import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Integer tree[] = new Integer[n];
		for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
		}		
		Arrays.sort(tree);
		int r = 0;
		for (int j = 0; j < k; j++) {
			r = r + tree[j];
		}
	  System.out.println(r);
	  sc.close();
	}
}