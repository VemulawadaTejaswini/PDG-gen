import java.util.Scanner;
class Main{
    int r;
    public void solve(){
        double f,v;
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        f = 1.0 * r * r * 3.14;
        v = 2.0 * r * 3.14;
        System.out.printf("%3.6f %3.6f",f,v);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}