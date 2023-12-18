import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long gcd = GCD(A,B);
        long num = DIV(gcd);
        System.out.println(num+1);
    }
    public static long GCD(long num1,long num2){
        if(num1%num2==0) return num2;
        return GCD(num2,num1%num2);
    }
    public static long DIV(long A){
        long num = 0;
        Set<Long> set = new HashSet<>();
        for(int i=2;i<Math.sqrt(A);i++){
            if(A%i==0) {
                set.add((long)i);
                A/=(long)i;
            }
        }
        num+=set.size();
        if(A>1) num++;
        return num;
    }
}