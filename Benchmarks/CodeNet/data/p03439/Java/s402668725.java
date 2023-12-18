import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int from = 0;
        int to = n - 1;
        System.out.println(from);
        System.out.flush();
        
        String fromState = sc.next();
        if (fromState.equals("Vacant")) {
            return;
        }
        
        System.out.println(to);
        System.out.flush();
        
        String toState = sc.next();
        if (toState.equals("Vacant")) {
            return;
        }

        int mid;
        int count = 0;
        while (count < 20) {
            count++;
            mid = (from + to) / 2;
            System.out.println(mid);
            System.out.flush();
            
            String midState = sc.next();
            if (midState.equals("Vacant")) {
                return;
            }
            
            // 前半の区間に注目
            boolean isSameState = midState.equals(fromState);
            boolean isDiffEven = (mid - from) % 2 == 0;
            
            if (isSameState && !isDiffEven || !isSameState && isDiffEven) {
                to = mid;
                toState = midState;
            } else {
                from = mid;
                fromState = midState;
            }
        }
        System.out.println();
    }
}