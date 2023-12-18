import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int[] man = new int[N];
        for (int i = 0; i < Q; i++) {
        	man[sc.nextInt() - 1]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	if (man[i] <= Q - K) {
        		sb.append("No\n");
        	} else {
        		sb.append("Yes\n");
        	}
        }
        System.out.println(sb);
    }
}