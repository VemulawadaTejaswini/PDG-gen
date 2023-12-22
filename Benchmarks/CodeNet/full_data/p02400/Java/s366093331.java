import java.util.Scanner;
class Main{
    int r;
    double A,B,C;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        C = 3.141592653589;
        A = 1.0 * r * r * C;
        B = 1.0 * 2.0 * r * C;
    }
    public void outputtt(){
        System.out.printf("%3.6f %3.6f %n",A,B);
    }
    public static void main(String[] args){
        new Main().solve();
        new Main().outputtt();
    }
}