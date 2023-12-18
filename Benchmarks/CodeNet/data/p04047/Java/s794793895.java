import java.util.*;

public class Main implements Comparable<Main>{

	int l;
	public Main(int l) {
		this.l = l;
	}
	
	public int compareTo(Main o) {
		if(l < o.l)return 1;
		else if(l > o.l)return -1;
		else return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int l[] = new int[2 * n];
		for(int i = 0; i < 2 * n; ++i)l[i] = sc.nextInt();
		sc.close();
		Arrays.sort(l);
		int ans = 0;
		for(int i = 0; i < 2 * n - 1; i += 2) {
			ans += l[i];
		}
		System.out.println(ans);
	}

}
