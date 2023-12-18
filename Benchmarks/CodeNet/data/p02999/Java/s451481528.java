import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int X = sc.nextInt();
        
        if(A < X){
            System.out.println("0");
        } else {
            System.out.println("10");
        }
        
        sc.close();
        
    }
}
