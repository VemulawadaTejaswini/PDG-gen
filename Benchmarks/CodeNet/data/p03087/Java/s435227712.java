import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        String[] strAry = new String[n];
        for (int i = 0; i < n; i++) {
            strAry[i] = String.valueOf(str.charAt(i));
        }
        
        while (q-- > 0) {
            int count = 0;
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;
            for (int i = start; i < end; i++) {
                if (strAry[i + 1].equals("C")) {
                    if (strAry[i].equals("A")) {
                        count++;
                    }
                    i++;
                    continue;
                } else if (strAry[i + 1].equals("A")) {
                    continue;
                } else {
                    i++;
                    continue;
                }
            }
            
            System.out.println(count);
        }
    }
}