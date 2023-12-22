import java.util.Scanner;
class Main{
    double r,x,y;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        x = r * r * 3.141592653589;
        y = 2 * r * 3.141592653589;
        System.out.printf("%8.6f %8.6f",x,y);
    }
    public static void main(String[] args){
        new Main().solve();
    }
}