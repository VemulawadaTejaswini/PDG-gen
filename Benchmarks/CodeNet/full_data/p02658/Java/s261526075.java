import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Long> list = new ArrayList<Long>();

        for (int i = 0; i < n; i++) {
            long a = scan.nextLong();
            list.add(a);
        }

        Collections.sort(list);
        //System.out.println(list);
        
        long ans = 1l;

        boolean flag = false;
        try {
            for (int i = 0; i < n; i++) {
                long a = list.get(i);
                if (a == 0) {
                    flag = true;
                    break;
                }
                ans *= a;
                if (ans > 1000000000000000000l || ans <= 0) {
                    break;
                }
            }

            if (flag) {
                System.out.println(0);
            } else {
            if (ans > 1000000000000000000l || ans <= 0) {
                //System.out.println(ans);
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
            }
        } catch (Exception e) {
            System.out.println(-1);
        }
        
    }
}