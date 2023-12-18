import java.util.*;

public class Main {
    //最小公倍数lcm
    static int lcm (int a, int b) {return a*b/gcd(a,b);}
    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int LCM = lcm(N,M);//N,Mの最小公倍数
        int LN = LCM/N;
        int LM = LCM/M;
        int lcmOflcm =lcm(LN,LM);
        int result = LCM;
        String S = sc.next();
        String T = sc.next();
        int LB = LCM/lcmOflcm;
        for(int i = 0; i < LB; i++){
            if(!(S.substring(N/LB*i,N/LB*i+1).equals(T.substring(M/LB*i,M/LB*i+1)))){
                result = -1;
            }
        }
        System.out.println(result);
    }
}
