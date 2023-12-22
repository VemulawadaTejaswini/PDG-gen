import java.util.*;
public class Main {
	public static void main(String[] args) {
		int MAX = 1000000;
		boolean[] p;
		p = new boolean[MAX+1]; p[0] = p[1] = true;
		for(int i=2;i<=MAX;i++) if(!p[i])
			for(int j=i*2;j<=MAX;j+=i) p[j] = true;
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int a = sc.nextInt(), d = sc.nextInt(), n = sc.nextInt();
			if( (a|d|n) == 0 ) break;
			for(;n!=0;a+=d) if(!p[a])n--;
			System.out.println(a-d);
		}
	}
}