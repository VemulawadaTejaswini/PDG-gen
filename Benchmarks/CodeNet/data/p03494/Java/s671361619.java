import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int cnt = 0;
        boolean hasNext = true;
        while (hasNext) {
            for (int i = 0; i < N; i++) {
                if (a[i] % 2 != 0) {
                    hasNext = false;
                    break;
                }
            }
            if(hasNext){
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
