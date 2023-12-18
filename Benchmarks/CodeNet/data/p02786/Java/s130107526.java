import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        int count = 0;
        long x = N;
        long res = 0;
        while(x != 0){
            x /= 2;
            count++;
        }
        for(int i=0;i<count;i++){
            res += (long)Math.pow(2,i);
        }
        System.out.println(res);
    }
}