import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long left=4*a*b;
        long right= (c-a-b)*(c-a-b);
        if (left < right && (a+b<c)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}