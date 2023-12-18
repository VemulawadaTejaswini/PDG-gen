import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = Integer.parseInt(sc.next());
        long R = Integer.parseInt(sc.next());
        
        if(L % 2019 == 0) {
            System.out.println(0);
        }else if(R - L >= 2019) {
            System.out.println(0);
        }else {
            long min = 2018;
            for(long i = L; i <= R; i++) {
                if(i % 2019 == 0) {
                    System.out.println(0);
                    break;
                }
                if(i == R) {
                    System.out.println((L % 2019 * (L+1) % 2019) % 2019);
                }
            }
        }
    }
}