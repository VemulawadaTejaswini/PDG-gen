import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = 0L;
        long ans = 0L;
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if(max < a){
                max = a;
            }else{
                ans += max - a;
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
