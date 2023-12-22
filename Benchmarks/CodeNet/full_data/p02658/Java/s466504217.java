import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int N = scanner.nextInt();

        long result = 1;

        final long a = (long) Math.pow(10, 18);

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            result = result * A;
       }


       if(a>result){
       System.out.print(result);
       }else{
           System.out.print(-1);
       }


    }
    
}