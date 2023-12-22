import java.util.*;

public class Main{
    void solve(){
        Scanner scan = new Scanner(System.in);
        double d = scan.nextInt();
        double t = scan.nextInt();
        double s = scan.nextInt();
        if(t >= (double)(d / s)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
