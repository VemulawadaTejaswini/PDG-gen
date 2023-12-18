import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            int cost = Integer.parseInt(sc.next());
            int time = Integer.parseInt(sc.next());
            a[i] = String.format("%010d", time) + "/" + cost;
        }

        Arrays.sort(a);
        int task = 0;
        boolean result = true;
        for (String s : a) {
            String[] info = s.split("/");
            int time = Integer.parseInt(info[0]);
            task += Integer.parseInt(info[1]);
            if (time < task) {
                result = false;
                break;
            }
        }

        System.out.println(result ? "Yes" : "No");
    }
}