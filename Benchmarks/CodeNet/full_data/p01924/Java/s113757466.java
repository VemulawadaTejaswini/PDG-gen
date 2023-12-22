import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
		    int T = sc.nextInt();
		    int D = sc.nextInt();
		    int L = sc.nextInt();
		    if (T == 0) return;
		    int ans = 0;
		    int index = 0;
		    int time = 0;
		    boolean b = false;
		    for (int i = 0; i < T; i++) {
			int x = sc.nextInt();
			if (x >= L) {
			    if (!b) {
				b = true;
				index = i;
			    }
			    time = D;
			}
			else time--;
			if (time == 0 || (i == T - 1 && time > 0)) {
			    ans += i - index;
			    b = false;
		        }
		    }
		    System.out.println(ans);
		}
	}
}

