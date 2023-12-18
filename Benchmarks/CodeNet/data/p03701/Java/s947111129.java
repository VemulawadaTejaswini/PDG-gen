
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] s = new int[N];
        for(int i = 0; i < N; i++) s[i] = sc.nextInt();

        Arrays.sort(s);
        int sum = 0;
        for(int si: s) sum += si;

        for(int si: s) {
            if(sum % 10 != 0) break;
            sum -= si;
        }
        System.out.println(sum);
    }
}