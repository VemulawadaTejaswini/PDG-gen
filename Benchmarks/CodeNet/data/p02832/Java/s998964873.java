import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int key = 1;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a == key) {
                key++;
            } else {
                ans++;
            }
        }
 
        System.out.println(key == 1 ? -1 : ans);
    }
}