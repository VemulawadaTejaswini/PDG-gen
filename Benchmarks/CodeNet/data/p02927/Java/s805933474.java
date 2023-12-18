import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m,d,sum = 0;
        
        m = sc.nextInt();
        d = sc.nextInt();
        
        for(int i = 4; i <= m; i++){
            for(int j = 22; j <= d; j++){
                int d10 = (int)j / 10;
                int d1 = (int)j % 10;
                if((d10 >= 2) && (d1 >= 2) && (i == d10 * d1)) sum++;
            }
        }
        
        System.out.println(sum);
    }
}
