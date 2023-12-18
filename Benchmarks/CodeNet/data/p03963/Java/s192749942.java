
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int total = 0;
        for(int i = 1;i <= N;i++){
            if(i == 1){
                total += K;
            }else{
                total *= K - 1;
            }
        }
        System.out.println(total);
    }
}
