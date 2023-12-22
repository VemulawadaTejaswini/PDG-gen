import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            A += V;
            B += M;
        }
        if(A >= B){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}