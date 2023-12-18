import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[3];
        aa[0] = Integer.parseInt(sc.next());
        aa[1] = Integer.parseInt(sc.next());
        aa[2] = Integer.parseInt(sc.next());
        int cnt = 0;
        while (true) {
            Arrays.sort(aa);
            if (aa[0] == aa[1] && aa[1] == aa[2]) {
                break;
            }
            cnt++;
            if (aa[0] == aa[1]) {
                aa[0]++;
                aa[1]++;
            } else {
                aa[0] += 2;
            }
        }
        System.out.println(cnt);
    }
}