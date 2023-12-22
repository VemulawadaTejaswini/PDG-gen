import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        if(x == 0) {
            System.out.println(x);
            return;
        }
        int min = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = -100; i <= 100; i++) {
            if(!list.contains(i)) {
                if(min > Math.abs(i - x)) {
                    min = Math.abs(i - x);
                    ans = i;
                }
            }
        }
        System.out.println(ans);
    }
}