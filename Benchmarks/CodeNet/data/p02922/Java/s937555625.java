import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int plugs = 1;
        while (plugs < b) {
            cnt++;
            plugs += a - 1;
        }
        System.out.println(cnt);
    }
}