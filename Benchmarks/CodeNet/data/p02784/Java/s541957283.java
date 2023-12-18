import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hn = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int i=0; i<hn[1]; i++) {
            sum += a[i];
        }
        String ans = "";
        if (hn[0] > sum) ans = "No";
        else ans = "Yes";

        System.out.println(ans);
    }
}