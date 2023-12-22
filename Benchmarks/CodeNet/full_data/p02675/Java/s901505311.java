import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int A = N%10;
        if(A==3)System.out.println("bon");
        else if(A==0||A==1||A==6||A==8)System.out.println("pon");
        else System.out.println("hon");

    }
    public static void main(String[] args) {
        new Main().solve();
    }
    }