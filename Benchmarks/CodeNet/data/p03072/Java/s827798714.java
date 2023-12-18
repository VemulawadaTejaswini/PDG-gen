import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
      	int[] H = new int[N];
      	int max = 1;
      	int cnt = 0;
      
      	for (int i = 0 ; i < N ; i++) {
          H[i] = Integer.parseInt(sc.next());
          if (H[i] >= max) {
            cnt++;
            max = H[i];
          }
        }
        System.out.println(cnt);
    }
}
