import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        for(long tmp=0; tmp<=1010; tmp++) {
            if(A != tmp * 8 / 100) continue;
            if(B != tmp * 10 / 100) continue;
            System.out.println(tmp);
            return;
        }
        System.out.println(-1);
    }
}