import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long A = a;
        long B = b;
        for (int i=1;i<b;i++) A=A*10+a;
        for (int i=1;i<a;i++) B=B*10+b;
        if (a<=b) System.out.println(A);
        else System.out.println(B);
    }
}