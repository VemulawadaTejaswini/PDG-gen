import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String winner = "second";
        for(long i = 0; i < n; i++){
            long a = sc.nextLong();
            if(a % 2 == 1){
                winner = "first";
                break;
            }
        }
        System.out.println(winner);
    }
}
