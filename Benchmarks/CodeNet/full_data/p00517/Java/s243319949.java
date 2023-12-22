import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int N = sc.nextInt();
		int wcnt= 0;
		int[] now = new int[2];
		int[] to = new int[2];
		now[0] = sc.nextInt();
		now[1] = sc.nextInt(); 
		for(int i = 1; i < N; i++) {
			to[0] = sc.nextInt();
			to[1] = sc.nextInt();
			int x = Math.abs(now[0] - to[0]);
			int y = Math.abs(now[1] - to[1]);
			if((now[0] <= to[0] && now[1] <= to[1]) || (now[0] <= to[0] && now[0] >= to[1])) {
				wcnt += Math.max(x, y);
			} else wcnt += x+y;
		}
	System.out.println(wcnt);	
	}

}