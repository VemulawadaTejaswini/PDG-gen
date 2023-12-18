import java.util.*;

class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        System.out.println(a * b / 2);
        scan.close();
    }
    public static void main(String[] args){
        new Main().solve();
    }
}
