import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nk = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] h = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int normal_attack = nk[0] - nk[1];
        Arrays.sort(h);

        long ans = 0;
        for(int i=0; i<normal_attack; i++) {
            ans += h[i];
        }
        System.out.println(ans);
    }
}