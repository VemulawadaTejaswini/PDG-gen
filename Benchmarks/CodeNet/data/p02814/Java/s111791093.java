import java.util.*;

public class Main {
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    static int lcm (int a, int b) {return a*b/gcd(a,b);}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[N];
        int nowLcm = 1;
        for(int i=0;i<N;i++){
            nowLcm = lcm(sc.nextInt(),nowLcm);
        }
        System.out.println(nowLcm);
        System.out.println((M + nowLcm) / nowLcm);






    }

}
