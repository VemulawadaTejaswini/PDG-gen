import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        long ans = 1L;
        long std = 1000000000000000000L;
        for (int i = 0; i < time; i++) {
            long mul = sc.nextLong();
            if(mul == 0){
                System.out.println(0);
                return;
            }else if(ans == -1){
                continue;
            }else if(mul > std / ans){
                ans = -1;
            }else{
                ans *= mul;
            }
        }
        System.out.println(ans);
    }
}
