import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        long damage = B*(N-1)+A;
        
        long total = 0;
        long answer = 0;
        
        for(int i = 0; i < N; i++) {
            total += scan.nextLong();
        }
        
        answer = total /damage;
        if(total % damage != 0) answer++;
        
        System.out.println(answer);
    }
}
