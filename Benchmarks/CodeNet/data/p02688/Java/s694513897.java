import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Map<Integer, Boolean> list = new HashMap<>();
        for (int i = 0; i < N; i++) {
            list.put(i, true);
        }
        for (int i = 0; i < K; i++) {
            sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < s.length; j++) {
                int a = Integer.parseInt(s[j]);
                if (list.get(a)) {
                    list.put(a, false);
                }

            }


        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if(list.get(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }

}
