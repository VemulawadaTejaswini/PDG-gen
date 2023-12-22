import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        double F,V;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        F = 1.0 * r * 1.0 * r * 3.141592653589;
        V = 2.0 * r * 3.141592653589;
        System.out.printf("%3.6f %3.6f",F,V);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}