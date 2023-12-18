import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        if(N<1000){
            System.out.println("ABC");
        }else{
            System.out.println("ABD");
        }
    }
}
