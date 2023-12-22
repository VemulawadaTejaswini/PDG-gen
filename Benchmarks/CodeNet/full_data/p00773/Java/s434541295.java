import java.util.*;

public class Main {
    public static int MAX = 1000001;
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int p = sc.nextInt();
            if (x == 0 && y == 0 && p == 0) break;
            
            int max = -2000000000;
            
            for (int i = 1; i < p / 2 + 1; i++) {
                int iTax = (int)(i * (100 + x) / 100);
                int jTax = p - iTax;
                int newVal = -2000000000;
                int j = (int)(jTax / (100 + x) / 100);
                while (true) {
                    j++;
                    if ((int)(j * (100 + x) / 100) > p - iTax) {
                        j--;
                        break;
                    }
                }
                if ((int)(i * (100 + x) / 100) + (int)(j * (100 + x) / 100) == p) {
                    newVal = (int)(i * (100 + y) / 100) + (int)(j * (100 + y) / 100);    
                }
                    
                
                max = Math.max(max, newVal);
            }
            
            System.out.println(max);
        }
    }
    
}


