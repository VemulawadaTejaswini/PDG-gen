import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = 0;
        double result = 0;
        boolean err = true;
        // 税抜き価格xに1.08をかけて小数を切り捨てた値がnになるxがあるか全探索で調べる
        for (int i = 1; i < n + 1; i++) {
            x = (double) i;
            result = Math.floor(x * 1.08);
            if((int)result == n){
                System.out.println(i);
                err = false;
                break;
            }
        }
        if(err){
            System.out.println(":(");  
        }
        sc.close();
    }
}