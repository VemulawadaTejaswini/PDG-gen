import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final int A,V,B,W,T ;
        A = sc.nextInt();
        V = sc.nextInt();
        B = sc.nextInt();
        W = sc.nextInt();
        T = sc.nextInt();
        sc.close();
        int diff = Math.abs(A - B);
        if (Math.abs(V - W) * T >= diff && V - M >0 && B - A > 0){System.out.println("YES");}
        if (Math.abs(V - W) * T >= diff && M - V >0 && A - B > 0){System.out.println("NO");}
        else {System.out.println("NO");}
    }
}