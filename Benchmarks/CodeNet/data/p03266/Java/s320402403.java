import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a;
        if (k%2==1){
            a=n/k;
            System.out.println((long)a*a*a);
        }else {
            a=n/k;
            int b = (n+k/2)/k;
            System.out.println((long)a*a*a+b*b*b);
        }
    }
}
