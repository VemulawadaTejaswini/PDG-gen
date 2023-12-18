import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      	int count = 0, sCount = 0;
        if (n > 0) {
            String s = scan.next();
            // scan.close();
            boolean flag = false;
            
            for (int i = 0; i < n; i++) {
                if ("#".equals(s.charAt(i) + "")) {
                    sCount++;
                    flag = true;
                } else if (flag) {
                    count++;
                }
                // System.out.println(flag);
            }
            if (sCount < count) {
                count = sCount;
            }

            

        }
      System.out.println(count);
    }
}