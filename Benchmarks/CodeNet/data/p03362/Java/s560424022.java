import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(2);
        sb.append(" ");
        sb.append(7);
        sb.append(" ");
        int count=3;
        int cur = 17;
        while(count<=N){
            if(isPrime(cur)){
                sb.append(cur);
                sb.append(" ");
                count++;
            }
            cur += 10;
        }
        System.out.print(sb.toString());
    }
    public static boolean isPrime(int t){
        for (int i=2; i <= t/2+1; i++) {
            if (t % i == 0) {
                return false;
            }
        }
        return true;
    }
}