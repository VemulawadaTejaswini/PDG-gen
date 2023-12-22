import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        
        if(A >= B){
            System.out.println("YES");
            System.exit(0);
        }

        for(int i = 0; i < T; i++){
            A += V;
            B += W;
            if(A >= B){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}