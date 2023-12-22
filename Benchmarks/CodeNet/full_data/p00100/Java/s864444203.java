import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        long[] ary = new long[4000];
        
        for (int i = 0; i < 4000; i++) {
            ary[i] = 0;
        }
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                
                ary[a] += (b * c);
            }
            
            boolean b = false;
            for (int i = 0; i < 4000; i++) {
                if (ary[i] >= 1000000) {
                    System.out.println(i);
                    b = true;
                }
                ary[i] = 0;
            }
            if (!b) {
                System.out.println("NA");
            }
            b = true;
        }
    }
}