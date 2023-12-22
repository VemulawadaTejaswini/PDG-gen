import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        
        if(V <= M){
            System.out.println("NO");
            System.exit(0);
        }

        for(int i = 0; i < T; i++){
            A += V;
            B += M;
            if(A >= B){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}