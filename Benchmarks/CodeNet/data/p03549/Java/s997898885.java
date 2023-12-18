import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n-m;
        int b = m;
        int c = (a*100+b*1900);
        double positive = 1/Math.pow(2,b);
        double negative = 1 - positive;
        //System.out.println(positive +" "+negative);
        double prob = positive*c;
        double ans = prob;
        double preans = 1;
        int cnt = 2;
        while((int)preans != (int)ans) {
            preans = ans;
            prob *= negative;
            ans += prob*cnt;
            cnt++;
        }

        System.out.println((int)ans);
    }
}