import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        boolean ans=false;
        lavel:for(int i=0;i<=25;i++){
            for(int j=0;j<=14;j++){
                if(i*4+j*7==N){
                    ans=true;
                    break lavel;
                }
            }
        }
        if(ans)
        System.out.println("Yes");
        else
            System.out.println("No");
    }
}