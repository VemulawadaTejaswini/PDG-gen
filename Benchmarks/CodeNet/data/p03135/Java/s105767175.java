import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        double t = scan.nextInt();
        double x = scan.nextInt();
        System.out.println(t / x);
        scan.close();
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}
