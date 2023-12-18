import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();int m = sc.nextInt();
        if(n==0) System.out.println(m);
        else if(n==1) System.out.println(m*100);
        else System.out.println(m*100*100);
    }
}
