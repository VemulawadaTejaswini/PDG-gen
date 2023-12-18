import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if(N%2==1){
            for (int l=1, r=N-1; l <= M ; l++, r--) {
                System.out.println(String.format("%d %d", l,r));
            }
        }else{
            for (int l = 1, r=N; l <= M ; l++, r--) {
                if(l<=N/4){
                    System.out.println(String.format("%d %d", l, r));
                }else{
                    System.out.println(String.format("%d %d", l+1, r));
                }
            }
        }
    }
}