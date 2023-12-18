import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        long L = sc.nextInt();
        long R = sc.nextInt();

        long min = Integer.MAX_VALUE;
        for(long i = L; i < R; i++){
            for(long j = i+1; j <= R; j++){
                min = Math.min(min,(i * j) % 2019);
            }
        }
        System.out.println(min);
    }
}
