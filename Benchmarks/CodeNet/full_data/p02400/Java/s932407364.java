import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        double F,V;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        F = 1.0 * (r * r * 3.141592653589);
        V = 1.0 * (2 * r * 3.141592653589);
        System.out.printf("%3.6f %3.6f \n",F,V);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}