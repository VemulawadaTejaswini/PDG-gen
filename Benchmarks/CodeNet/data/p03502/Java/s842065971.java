import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        
        int a = x;
        int b = 0;
        
        while(a > 0){
            b = b + a % 10;
            a = a / 10;
        }
        
        if(x % b == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
        
    }
}
