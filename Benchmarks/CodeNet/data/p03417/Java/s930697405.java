import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextInt();
        long M=sc.nextInt();
        if(N==1){
            N=1;
        }else{
            N=N-2;
        }
        if(M==1){
            M=1;
        }else{
            M=M-2;
        }
        System.out.println(N*M);
    }

}
