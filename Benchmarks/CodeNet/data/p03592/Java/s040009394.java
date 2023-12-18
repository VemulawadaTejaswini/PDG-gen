import java.util.Scanner;

/**
 * Created by torum on 2017/09/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
       for(int i= 0; i <= N; i++ ){
            for(int j = 0; j<= M;j++){
                count = 0;
                count = i*M + j*N - (2*i*j);
                System.out.println(count);
                if(K == count){
                    System.out.println("Yes");
                    return ;
                }
            }
       }
       System.out.println("No");


    }
}
