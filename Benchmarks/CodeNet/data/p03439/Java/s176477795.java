import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(0);
        String res0 = sc.next();
        if (res0.equals("Vecant")) {
            return;
        }

        System.out.println(1);
        String res1 = sc.next();
        if (res1.equals("Vecant")) {
            return;
        }
        System.out.println(N/2);
        String res2 = sc.next();
        if (res2.equals("Vecant")) {
            return;
        }

        int left = 1;
        int right = N/2+1;
        int len = right-left;
        String evenKey = res1; 
        String oddKey = res2;
        if ((len%2 == 1 && res2.equals(res1))
            || (len%2 == 0 && !res2.equals(res1))) {
            System.out.println((N+1)/2);
            String res3 = sc.next();
            if (res3.equals("Vecant")) {
                return;
            }
            System.out.println(N-1);
            String res4 = sc.next();
            if (res4.equals("Vecant")) {
                return;
            }
            left = (N+1)/2;
            right = N;
            evenKey = res3;
            oddKey = res4;
        }

        // binary search
        while (left < right) {
            int mid = (left+right)/2;
            System.out.println(mid);
            String resm = sc.next();
            if (resm.equals("Vecant")) {
                return;
            }
            if ((mid%2 == 0 && resm.equals(evenKey))
                || (mid%2 == 1 && resm.equals(oddKey))) {
                right = mid;
            } else {
                left = mid;
            }
        }
    }
}
