import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力                                                           
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        boolean can = false;

        for(int i=0; i< N; i++){
            for(int j=0; j < N; j++){
                if(K == j*(M-i) + i*(N-j) && !can){
                    System.out.println("Yes");
                    can = true;
                }
            }
        }
        if(!can) System.out.println("No");

    }
}