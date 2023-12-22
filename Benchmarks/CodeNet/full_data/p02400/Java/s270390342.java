import java.util.Scanner;
class Main{
    int r;
    double A = 0.0;
    double B = 0.0;
    double C = 3.141592653589;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        A = 1.0 * (double)r * (double)r * C;
        B = 1.0 * 2.0 * (double)r * C;
        System.out.printf("%3.6f %3.6f %n",A,B);    
    }

    public static void main(String[] args){
        new Main().solve();

    }
}