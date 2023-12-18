import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vals = sc.nextLine().split(" ");
        double N = getInt(vals[0]);
        double K = getInt(vals[1]);

        int count1 = 0;
        int count2 = 0;
        for(int i = 1;i <= N;i++){
            if (i % K == 0) count1++;
            if (i % K == 2/K) count2++;
        }
        System.out.println((int)Math.pow(count1,3) + (int)Math.pow(count2,3));
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static long getLong(String val) {
        return Long.parseLong(val);
    }
}