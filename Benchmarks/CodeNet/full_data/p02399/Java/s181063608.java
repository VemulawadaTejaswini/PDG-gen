import java.util.Scanner;
class Main{
    int a,b;
    public void solve(){
        int d, r;
        double f;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        d = a / b;
        r = a % b;
        f = a / b;
        System.out.printf("%2d%2d%.7f",d,r,f);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}