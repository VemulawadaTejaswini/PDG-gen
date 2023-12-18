import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static long[] find_goal(long N){
        for(long i = (long)Math.sqrt(N); i > 0;i--){
            if(N%i == 0){return new long[]{i,N/i};}
        }
        return new long[]{1,N};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = find_goal(Long.parseLong(sc.next()));
        System.out.println(Arrays.stream(a).sum()-2);
    }
}