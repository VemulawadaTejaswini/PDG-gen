import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        double A,B;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        double C = 3.141592653589;
        A = 1.0 * r * r * C;
        B = 1.0 * 2.0 * r * C;
        System.out.printf("%3.6f %3.6f %n",A,B);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}