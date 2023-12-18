import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(f(0,N,0));
    }

    static int f(int a, int N, int ret) {
        if(a > N) return ret;
        else {
            if(isNum(a, 7)&&isNum(a, 5)&&isNum(a, 3)) ret++;
            ret += f(10*a+7, N, 0);
            ret += f(10*a+5, N, 0);
            ret += f(10*a+3, N, 0);
            return ret;
        }
    }

    static boolean isNum(int n, int Num) {
        while(n > 0) {
            if(n % 10 == Num) return true;
            n /= 10;
        }
        return false;
    }
}