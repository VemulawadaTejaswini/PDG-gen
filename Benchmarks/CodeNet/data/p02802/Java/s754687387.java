import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] pass = new boolean[n];
        int[] pens = new int[n];
        
        int pen = 0;
        int ac = 0;
        while (k-- > 0) {
            int q = sc.nextInt() - 1;
            String str = sc.next();
            if (str.equals("WA")) {
                if (pass[q] == false) {
                    pens[q]++;
                }
            } else {
                pass[q] = true;
            }
        }
        
        for (int i = 0; i < n; i++) {
            pen += pens[i];
        }
        for (int i = 0; i < n; i++) {
            if (pass[i]){
                ac++;
            }
        }
        
        System.out.println(ac + " " + pen);
    }
}
