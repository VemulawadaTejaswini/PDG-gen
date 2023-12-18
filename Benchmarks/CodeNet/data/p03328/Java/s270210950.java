import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int x = b - a;
        
        int ans = 0;
        for(int i = 1; i <= x; i++){
            ans = ans + i;
        }
        
        System.out.println(ans - b);
        
        sc.close();
        
    }
}
