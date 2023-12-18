//入力値の形式：[N]
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int []C_array = new int [N];
       int []S_array = new int [N];
       int []F_array = new int [N];

       for(int i = 0; i < N-1; i++){
           HairetuKakunou(i,sc.nextInt(),sc.nextInt(),sc.nextInt(),C_array,S_array,F_array);
       }
       
       for(int i = 0; i < N; i++){
           int t = 0;
           for(int j = 0; j < N-1; j++){
               if (t < S_array[j]) t = S_array[j];
               else if(t%F_array[j] == 0);
               else t = t + F_array[j] - t % F_array[j];
               t += C_array[j];
           }
           System.out.println(t);
       }
    }
    
    private static void HairetuKakunou(int i, int C, int S, int F,int []C_array,int []S_array,int []F_array){
        C_array[i] = C;
        S_array[i] = S;
        F_array[i] = F;
    }
    
}