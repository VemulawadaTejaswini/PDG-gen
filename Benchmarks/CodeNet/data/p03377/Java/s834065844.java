import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int X=sc.nextInt();
        if(X-A<B&&A<=X){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}