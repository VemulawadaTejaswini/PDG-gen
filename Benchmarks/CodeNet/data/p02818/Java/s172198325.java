import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, A, B, K;
        A = scan.nextInt();
        B = scan.nextInt();
        K = scan.nextInt();
        for(i=0; i<K; i++){
            if(A!=0){
                A=A-1;
            }else{
                B=B-1;
            }
        }
        System.out.print(A+ " "+B);
    }
}
