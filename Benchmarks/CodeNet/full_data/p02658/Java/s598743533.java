package atcoder.abc169B;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        long result = 1;

        long a = (long) Math.pow(10, 18);

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            result = result * A;
            if(result==0){
                break;
            }

            if(result<0){
                result+=-1;
            }
       }


       if(a>result && result>=0){
           System.out.print(result);
       }
       if(a<result || result<0){
           System.out.print(-1);
       }


    }
    
}