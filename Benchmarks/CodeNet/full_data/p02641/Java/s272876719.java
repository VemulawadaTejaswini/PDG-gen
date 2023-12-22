import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        
        for (int i = 0; i <= 3000; i++) {
            if (!set.contains(x-i)) {
                System.out.println(x-i);
                return;
            }
            if (!set.contains(x+i)) {
                System.out.println(x+i);
                return;
            }
        }
        
    }
}
