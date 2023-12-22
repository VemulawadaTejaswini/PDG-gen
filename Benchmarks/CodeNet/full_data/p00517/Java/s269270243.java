import java.util.*;
public class Main {
	public void doit() {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.nextInt();
		int N = sc.nextInt();
		int wcnt= 0;
		int[] now = new int[2];
		int[] to = new int[2];
		now[0] = sc.nextInt();
		now[1] = sc.nextInt(); 
		for(int i = 1; i < N; i++) {
			to[0] = sc.nextInt();
			to[1] = sc.nextInt();
			int x = to[0] - now[0];
			int y = to[1] - now[1];
			//System.out.printf("%d %d\n", x,y);
			if(x >= 0 && y >= 0 || x < 0 && y < 0) {
				x = Math.abs(x); y = Math.abs(y);
				wcnt += Math.max(x,y);
			} else {
				x = Math.abs(x); y = Math.abs(y);
				wcnt += x+y;
			}
			//System.out.println(wcnt);
			now[0] = to[0]; now[1] = to[1];
		}
	System.out.println(wcnt);
	}
	public static void main(String[] args) {
		new Main().doit();
	}

}