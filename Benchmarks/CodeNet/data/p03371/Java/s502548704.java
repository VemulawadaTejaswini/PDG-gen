import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int X = scan.nextInt();
        int Y = scan.nextInt();

        int ans = 1000000000;
        for(int i = 0;i <= 2*(X+Y);i++){
           int ABpizza = i;
           int Apizza = 0;
           int Bpizza = 0;
           if(X - i/2>=0){ Apizza = X - i/2;}
           if(Y - i/2>=0){ Bpizza = Y - i/2;}
           ans = Math.min(ans,Apizza*A+Bpizza*B+ABpizza*C);
        }
        System.out.println(ans);
    }
}

