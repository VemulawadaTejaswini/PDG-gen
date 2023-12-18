import java.util.Scanner;

//ABC055B
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans = 1;
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            ans *= i;
        }
        System.out.println(ans % (10^9*7));
    }
}