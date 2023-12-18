import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] Ln;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ln = new long[N];
            for (int i = 0; i < Ln.length; i++) {
                Ln[i] = sc.nextLong();
            }

        }
        long result = 0;
        Arrays.sort(Ln);

        for (int i = 0; i < Ln.length; i++) {
            for (int j = i + 1; j < Ln.length; j++) {
                int k = Ln.length -1;
                while(k > j){
                    if(Ln[k] < Ln[i]+Ln[j]){
                        result += (k-j);
                        break;
                    }
                    k--;
                }
            }
        }
        System.out.println(result);

    }
}
