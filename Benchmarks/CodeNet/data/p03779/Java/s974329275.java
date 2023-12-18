import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = 0;
        int jump = 1;
        while(n > 0) {
            n -= jump;
            cnt++;
            jump++;
        }

        System.out.println(cnt);
    }
}