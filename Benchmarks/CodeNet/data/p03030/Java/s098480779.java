import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next() +  (1100 - sc.nextInt()) + "_" + (i + 1);
        }
        Arrays.sort(list);
        for (String lis : list) {
            String[] li = lis.split("_");
            System.out.println(li[1]);
        }
    }
}
