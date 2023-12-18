import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int candidate = Integer.MAX_VALUE;
        int totalTaste = 0;
        boolean isMinus = false;
        for(int i = 1; i <= n; i++) {
            int taste = l + i - 1;
            int a = Math.abs(0 - taste);
            if(a < candidate) {
                candidate = a;
                if (taste < 0) isMinus = true;
                else isMinus = false;
            }
                totalTaste += taste;
        }
        if(isMinus) {
            System.out.println(totalTaste + candidate);
        } else {
            System.out.println(totalTaste - candidate);
        }
    }
}
