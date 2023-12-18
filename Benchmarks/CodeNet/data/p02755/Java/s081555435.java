import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        //A <= 0.08x < A + 1
        //B <= 0.10x < B + 1
        
        double axmin = A / 0.08;
        double axmax = (A+1) / 0.08;
        double bxmin = B * 10;
        double bxmax = (B+1) * 10;
        
        if(axmax > bxmin && axmin <= bxmin) {
            System.out.println((int)bxmin);
        }else if(bxmax > axmin && bxmin <= axmin) {
            System.out.println((int)axmin);
        }else {
            System.out.println(-1);
        }
    }
}