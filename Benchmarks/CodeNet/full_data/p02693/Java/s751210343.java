import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().solve();
    }

    void solve(){
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        for(int i = a; i <= b; i++)
            if(a % k == 0){
                System.out.println("OK");
                return;
            }
        System.out.println("NG");
    }
}
