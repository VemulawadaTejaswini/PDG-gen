
import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for (int i=0;i<N;i++) a.add(scan.nextInt());

        Collections.sort(a, Collections.reverseOrder());
        int ans = 0;
        for(int i=0;i<N-2;i++) ans += a.get(i);
        ans += a.get(1);
        System.out.println(ans);
        }
    }
