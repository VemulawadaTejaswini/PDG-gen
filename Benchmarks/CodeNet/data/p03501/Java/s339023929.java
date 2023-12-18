import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int plan_b = sc.nextInt();
        
        int plan_a = a * b;
        
        if(plan_a <= plan_b) {
            System.out.println(plan_a);
        }
        else {
            System.out.println(plan_b);
        }
    }
}