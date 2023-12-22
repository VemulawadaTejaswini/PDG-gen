import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan;
    int A;
    int B;
    int C;
    int K;
    int Aa;
    int Bb;

    scan = new Scanner(System.in);
    A = scan.nextInt();
    B = scan.nextInt();
    C = scan.nextInt();
    K = scan.nextInt();

    if (K >= A){
        Aa = A;
        K = K - Aa;
        if (K == 0){
            System.out.println (1*Aa);
        }else{
            if ( K >= B){
                Bb = B;
                K = K - Bb;
                if (K == 0){
                    System.out.println(1*Aa + 0*Bb);
                }
            }
        }
    }
    }
}
