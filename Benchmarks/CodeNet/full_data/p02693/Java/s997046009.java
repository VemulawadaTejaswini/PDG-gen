import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int A = scan.nextInt();
        int B = scan.nextInt();
        for(int i=0;i<=B/K;i++){int C = K*i;
            if(A<=C && C<=B)
            {System.out.println("OK");return;}
        }System.out.println("NG");
    }
    public static void main(String[] args) {
        new Main().solve();
    }
    }