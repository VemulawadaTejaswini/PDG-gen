import static java.lang.System.*;
import java.util.*;

public class Main {
	public static int getMSB(int n) {
		n = (n & 0xffff0000) > 0 ? n & 0xffff0000 : n;
		n = (n & 0xff00ff00) > 0 ? n & 0xff00ff00 : n;
		n = (n & 0xf0f0f0f0) > 0 ? n & 0xf0f0f0f0 : n;
		n = (n & 0xcccccccc) > 0 ? n & 0xcccccccc : n;
		n = (n & 0xaaaaaaaa) > 0 ? n & 0xaaaaaaaa : n;
		
		return n;
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		PriorityQueue<Integer> num = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0; i<n; i++) num.add(sc.nextInt());
		
		int ans = 0;
		while(!num.isEmpty()) {
			int target = num.poll();			
			int pair = (getMSB(target) << 1) - target;

			if(num.contains(pair)) {
				num.remove(pair);
				ans++;
			}
		}
		
        out.println(ans);
    }
}

