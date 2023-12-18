import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A, Collections.reverseOrder());
        Long now = 0L;
        Long use1 = 0L;
        boolean first = true;
        Long use2 = 0L;
        for (Long l : A) {
            if (l.equals(now)) {
                if (first) {
                    first = false;
                    use1 = l;
                    now = 0L;
                    continue;
                } else {
                    use2 = l;
                    break;
                }
            }
            now = l;
        }
        System.out.println(use1*use2);
    }    
}
