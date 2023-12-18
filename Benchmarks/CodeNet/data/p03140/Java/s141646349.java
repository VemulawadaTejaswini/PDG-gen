import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();

        int diff=0;
        for(int i=0; i<N; i++){
            char ca = A.charAt(i);
            char cb = B.charAt(i);
            char cc = C.charAt(i);
            if(ca != cb){
                diff++;
            }
            if(ca != cc) {
                diff++;
            }
        }
        System.out.printf("%d%n",diff);
    }

}
