import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        solve2197();
    }

    public static void solve2197() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int N = sc.nextInt();
            if(N == 0){
                break;
            }
            int count=0;
            if(N != 1 || N != 2){
                int sum = 1;
                for(int i = 2; sum + i <= N; i++){
                    sum += i;
                    if((N - sum)%i == 0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}