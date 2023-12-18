import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ret = 0;
        // 差が偶数
        if((b-a)%2==0){
            ret = (b-a)/2;
        }
        // 差が奇数
        else{
            ret = n-a > b-1 ? b-1 : n-a;
        }
        System.out.println(ret);
    }
}
