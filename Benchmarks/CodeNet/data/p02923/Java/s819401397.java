import java.util.*;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        int prev = 0;
        int now = 0;

        int max = 0;
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i==0){
                prev = sc.nextInt();
                continue;
            }
            now = sc.nextInt();
            if(now <= prev) {
                max ++;
                if(i == n-1) {
                    maxList.add(max);
                }
            } else {
                maxList.add(max);
                max = 0;
            }
            prev = now;

        }
            System.out.println(Collections.max(maxList));
    }
}
