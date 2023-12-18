import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] c= new int[N];
        int x = 0;
        for(int i = 1; i < N; i++ ){
            if(M%i ==0){
                if(M/i>=N){
                    x=i;
                }
            }
        }
        System.out.println(x);
    }
}
