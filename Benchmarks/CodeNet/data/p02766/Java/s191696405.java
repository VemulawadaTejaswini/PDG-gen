import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int ans = 0;
        while(true){
            int num = (int)Math.pow(K, ans);
            if(num > N){
                break;
            }
            ans += 1;
        }
        System.out.println(ans);
    }
}