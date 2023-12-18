import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }
        
        int D = 0;
        int count = 1;
        for(int i = 0; i < N; i++){
            D += L[i];
            if(D <=X){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
