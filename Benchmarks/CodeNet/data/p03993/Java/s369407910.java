import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int n = sc.nextInt();
        int[] as = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            as[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int as_i = as[i];
            if (as_i > i && as[as_i] == i) {
                count++;
            }
        }
        // output
        System.out.println(count);
    }

}