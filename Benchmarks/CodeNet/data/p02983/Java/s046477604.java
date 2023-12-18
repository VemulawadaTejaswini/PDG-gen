import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = Integer.parseInt(sc.next());
        long r = Integer.parseInt(sc.next());
        long ans = Long.MAX_VALUE;
        long diff = r - l;
        for(long i = 0;i<diff;i++){
            for(long j = 0;j<diff - i;j++){
                long tmp = l * (r - j) % 2019;
                ans = Math.min(ans,tmp);
            }
            l += 1;
            if(ans == 0){
                break;
            }
        }
        System.out.println(ans);
    }
}
