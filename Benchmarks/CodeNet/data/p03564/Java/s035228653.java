import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int sum = 1;
        for(int i = 0;i < N;i++){
            if(sum <= K){
                sum = sum * 2;
            }else{
                sum = sum + K;
            }
        }
        System.out.println(sum);
    }
}