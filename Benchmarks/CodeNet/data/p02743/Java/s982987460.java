import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long left=4*a*b;
        double eps= 0.00001;
        long right= (c-a-b)*(c-a-b);
        if (left +eps < right) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}