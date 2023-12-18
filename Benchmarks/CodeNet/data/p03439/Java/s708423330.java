import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(0);
        String res0 = sc.next();
        if (res0.equals("Vacant")) {
            return;
        }

        System.out.println(1);
        String res1 = sc.next();
        if (res1.equals("Vacant")) {
            return;
        }
        System.out.println(N/2);
        String res2 = sc.next();
        if (res2.equals("Vacant")) {
            return;
        }

        int left = 1;
        int right = N/2+1;
        String oddKey = res1; 

        // binary search
        while (left < right) {
            int mid = (left+right)/2;
            System.out.println(mid);
            String resm = sc.next();
            if (resm.equals("Vacant")) {
                return;
            }
            if ((mid%2 == 0 && resm.equals(oddKey))
                || (mid%2 == 1 && !resm.equals(oddKey))) {
                right = mid;
            } else {
                left = mid;
            }
        }
    }
}
