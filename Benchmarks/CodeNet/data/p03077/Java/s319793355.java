import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        ArrayList<Long> li = new ArrayList<>();
        long ans = 4;
        long max = 0;
        for(int i = 0; i < 5; i++){
            max = Math.max(max,(long)Math.ceil((double)n/sc.nextDouble()));
        }
        System.out.println(ans+max);
    }
}