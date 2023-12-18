
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int A=scanner.nextInt();
        final int B=scanner.nextInt();
        final int C=scanner.nextInt();
        final int K=scanner.nextInt();
        if(K%2==0){
            System.out.println(A-B);
        }else{
            System.out.println(B-A);
        }

    }
}