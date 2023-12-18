import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long max = Math.max(A,B);
        long min = Math.min(A,B);
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        long sosu = 0;
        for(long i=2; i<=Math.sqrt(min); i++) {
            if(min % i == 0) {
                if(max % i == 0) {
                    if(sosuu(i) && (list.contains(i) == false)) {sosu++;}
                    list.add(i);
                }
                if(max % (max/i) == 0) {
                    if(sosuu(min/i) && (list.contains(min/i) == false)) {sosu++;}
                    list.add(min/i);
                }
            }
        }
        
        if(sosuu(A) && sosuu(B) && A == B && A > Math.sqrt(A) && B > Math.sqrt(B)) sosu++;
        System.out.println(sosu+1);
    }

    public static boolean sosuu(long n) {
        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
