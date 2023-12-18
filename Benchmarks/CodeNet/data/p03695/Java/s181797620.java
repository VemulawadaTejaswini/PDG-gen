import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] color = new boolean[8];
		int topcoder = 0;
		int ans = 0;
		for(int i = 0; i < N; i++) {
			int rate = sc.nextInt();
			for(int j = 1; j <= 8; j++) {
				if(rate < j*400) {
					color[j-1] = true;
					break;
				}
			}
			if(rate >= 3200)
				topcoder += 1;
		}
		for(int i = 0; i < 8; i++) {
			if(color[i])
				ans ++;
		}
      	if(ans == 0){
          	System.out.println(1 + " " + topcoder);
              return;
        }
		System.out.println(ans + " " + (ans+topcoder));
	}

}
