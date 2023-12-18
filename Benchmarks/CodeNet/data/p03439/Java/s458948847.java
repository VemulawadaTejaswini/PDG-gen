import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int from = 0;
        int to = n - 1;
        String fromState = execQuery(from);
        if (fromState.equals("Vacant")) {
            return;
        }
        String toState = execQuery(to);
        if (toState.equals("Vacant")) {
            return;
        }

        while (true) {
            int mid = (from + to) / 2;
            
            String midState = execQuery(mid);
            if (midState.equals("Vacant"))
                return;
            
            boolean isSameState = midState.equals(fromState);
            boolean isDiffEven = (mid - from) % 2 == 0;
            if (isSameState && !isDiffEven ||
                    !isSameState && isDiffEven) {
                to = mid;
                toState = midState;
            } else {
                from = mid;
                fromState = midState;
            }
        }
    }
    
    static String execQuery(int qu) {
        System.out.println(qu);
        System.out.flush();
        return sc.next();
    }
}