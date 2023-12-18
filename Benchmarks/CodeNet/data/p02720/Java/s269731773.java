import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        int count = 0;
        for (long i = 1; i <= 3234566667L; i++) {
            //System.out.println(i);
            String str = String.valueOf(i);
            char c[] = str.toCharArray();
            boolean ok = true;
            for (int j = 0; j < c.length - 1; j++) {
                int a = c[j] - '0';
                int b = c[j+1] - '0';
                if (Math.abs(a-b) > 1) {
                    ok = false;
                    String str2 = str.substring(0, j);
                    int cz = a + 1;
                    for (int l = 0; l < c.length - j; l++) {
                        String str4 = String.valueOf(cz);
                        if (a == 9 && b == 0) {
                            i--;
                            a = c[j] - '0';
                            b = c[j+1] - '0';
                            //a++;
                            for (int y = 0; y < c.length - j; y++) {
                                str2 += a;
                                a--;
                            }
                            break;
                        }
                        str2 += cz;
                        cz--;
                        if (cz == 9) cz = 0;
                        if (cz == -1) cz = 0;
                    }
                    
                    i = Long.parseLong(str2);
                    i--;
                    break;
                }
            }
            
            if (ok) count++;
            
            if (count == k) {
                System.out.println(i);
                return;
            }
        }
    }
}
