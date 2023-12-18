import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long a = sc.nextLong();
        Long b = sc.nextLong();
        Long res = a*n/(a+b);
        Long amari = n%(a+b);
        res += Math.min(amari, a);
        System.out.println(res);

    }
}
