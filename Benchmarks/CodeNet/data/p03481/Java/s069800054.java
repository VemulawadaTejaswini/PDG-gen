import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ans = 0;
        long pow = 1;
        while(x * pow <= y){
            pow *= 2;
            ans++;
        }
        System.out.println(ans);
    }
}
