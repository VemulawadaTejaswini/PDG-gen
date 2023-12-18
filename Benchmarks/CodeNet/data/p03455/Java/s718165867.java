import java.util.*;

public class Main {
    
    public static void easymod(int a, int b){
        if ((a*b)%2 == 0){
            System.out.println("Even");
        } else {
             System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        easymod(a,b);
    }
}