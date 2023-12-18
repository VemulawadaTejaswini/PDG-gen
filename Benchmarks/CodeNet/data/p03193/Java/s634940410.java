

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int N = scanner.nextInt();
         int H = scanner.nextInt();
          int W = scanner.nextInt();
           for(int i = 0 ; i <N;i++){
           int A =scanner.nextInt();
           int B = scanner.nextInt();
           if(A>H && B>W || A==H &B==W){
           count++;
           }
           }
           
           System.out.println(count);
    }
    
}
