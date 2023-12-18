import java.util.*;

public class Main{

    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] count  = new int[N+1];
        for(int i=2; i<=N; i++){
            int a = scanner.nextInt();
            count[a] ++;
        }
        for(int i=1; i<=N; i++){
            System.out.println(count[i]);
        }
    }
}