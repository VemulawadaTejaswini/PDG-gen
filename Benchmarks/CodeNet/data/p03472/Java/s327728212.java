import java.util.*;
public class Main {
    Scanner sc = new Scanner(System.in);
    void doIt() {
        int N = sc.nextInt();
	int H =	sc.nextInt();
        int [] as = new int[N];
        int [] bs = new int[N];
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            as[i] = a;
            bs[i] = b;
        }
        Arrays.sort(as);
        Arrays.sort(bs);
	int amax = as[N-1];
        int sum = 0;
	int cnt = 0;
        for(int i = N-1; i >= 0; i--) {
            if(bs[i] <= amax) {
		break;
	    }
            sum += bs[i];
            cnt++;
	    if(sum >= H) {
                break;
            }
	}
        int rem = H - sum;
	if(rem > 0) cnt += (rem + amax - 1) / amax;
        //      System.out.print("Answer=");                                            
        System.out.println(cnt);
    }
    public static void main(String args[]) {
        new Main().doIt();
    }
}
