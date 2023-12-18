import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long hikaku = a+b-c;
        
        double root = Math.sqrt(a*b);
        System.out.println(hikaku+2*root < 0 ?"Yes":"No");

    }
}
