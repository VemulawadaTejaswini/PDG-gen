import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];
        for (int i=0; i<N; i++) {
            values[i] = i;
        }
        int count = 1;
        hoge: while (true) {
            int cnt = 0;
            for (int i=0; i<N; i++) {
                if (values[i] % 2 == 0) {
	                values[i] = values[i] / 2;
                } else {
                  cnt++ ;
                }  
            }
            count++;
           
            if (cnt == N - 1) {
              break hoge;
            }
        }
        System.out.println(count);
    }
}