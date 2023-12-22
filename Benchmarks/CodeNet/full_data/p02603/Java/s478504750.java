import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        
        // 「上がる直前で買う、下がる直後で売る」の結果得するならそれをする
        
        boolean hold = false;
        long money = 1000;
        long min = array[0];
        long max = array[0];
        for (int i = 1; i < n; i++) {
            long now = array[i];
            if (hold) {
                if (max <= now) {
                    max = now;
                } else {
                    long getkabu = money / min;
                    long getmoney = max * getkabu;
                    // int remain = money - (getkabu * min);
                    long remain = money % min;
                    
                    money = getmoney + remain;
                    min = now;
                    hold = false;
                }
            } else {
                if (min >= now) {
                    min = now;
                } else {
                    max = now;
                    hold = true;
                }
            }
            
            // System.out.println(i + " " + money);
        }
        
        if (hold) {
            // System.out.println(123);
            long getkabu = money / min;
            long getmoney = max * getkabu;
            long remain = money % min;
            // System.out.println(getkabu);
            // System.out.println(array[n-1]);
            
            money = getmoney + remain;
        }
        
        System.out.println(money);
    }
}
