import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int X = sc.nextInt();
        int ans = X;
        for(int i=1;i<=N;i++){
            int cur =sc.nextInt();
            ans += (D-1)/cur+1;
            
        }
        

        System.out.println(ans);
    }
}