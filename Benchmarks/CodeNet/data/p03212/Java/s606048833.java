import java.util.*;
class Abc
{
    static long cnt = 0;
    static long n;
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        func(0);
        System.out.println(cnt);
    }
    public  static boolean judge(long i){
        boolean b1 = false, b2 = false, b3 = false;
        while(i > 0){
            long k = i % 10;
            if(k == 3) b1 = true;
            else if(k == 5) b2 = true;
            else if(k == 7) b3 = true;
            i /= 10;
        }
        if(b1 && b2 && b3) return true;
        else return false;
    }
    public static void func(long i){
        if(i > n) return;
        if(judge(i)) cnt++;
        func(i * 10 + 3);
        func(i * 10 + 5);
        func(i * 10 + 7);
    }
}