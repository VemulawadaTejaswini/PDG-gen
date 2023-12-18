import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String n;
        int[] a;

        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        a = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        int ans = a[a.length-1] - a[0];
        System.out.println(ans);
    }

}