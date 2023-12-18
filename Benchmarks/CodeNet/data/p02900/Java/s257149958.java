import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = GCD(A,B);
        long num = DIV(gcd);
        System.out.println(num);
    }
    public static long GCD(long num1,long num2){
        if(num1%num2==0) return num2;
        return GCD(num2,num1%num2);
    }
    public static long DIV(long A){
        long num = 0;
        Set<Long> set = new HashSet<>();
        for(long i=2;i*i<=A;){
            if(A%i==0) {
                set.add(i);
                A/=i;
            }
            else i++;
        }
        num+=set.size()+1;
        if(A>(long)1) num++;
        return num;
    }
}