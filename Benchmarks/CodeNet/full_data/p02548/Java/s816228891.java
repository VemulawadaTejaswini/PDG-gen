import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int c = 1; c < N; c++){
            for (int a = 1; a < N; a++){
                for (int b = 1; a*b+c<=N; b++){
                    if(a*b+c == N) count++;
                }
            }
        }
        System.out.println(count);
    }
}
