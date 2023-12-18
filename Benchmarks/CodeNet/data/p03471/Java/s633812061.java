import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int resultX = -1,resultY = -1,resultZ = -1;
        boolean flag = false;
        int n = sc.nextInt();
        int total = sc.nextInt();
        
        for (int x = 0; x <= n; x++){
            for (int y = 0; y + x <= n; y++){
                int z = n - x - y;
                if (total == 10000*x + 5000*y + 1000*z) {
                    resultX = x;
                    resultY = y;
                    resultZ = z;
                    flag = true;
                    break;
                }
            }
            
            if (flag) break;
        }
        
        System.out.printf("%d %d %d", resultX, resultY, resultZ);
        sc.close();
    }
}