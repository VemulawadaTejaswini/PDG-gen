import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        long left=4*a*b;
        long right= (c-a-b)*(c-a-b);
        if(c-a-b<=0){
            System.out.println("No");
            return;
        }
        if (left < right) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}