import java.util.*;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        //ここまで入力

        int ans = lcm(A,B);

        System.out.println(ans);
    }
        //AとBの最小公倍数を求める
    static int lcm (int a, int b) {
        int temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (int)(c/b);
    }
}