import java.util.*;
import java.util.Arrays;
import java.util.List;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        String[] D = new String[K];

        for(int i=0; i<K; i++){
            D[i] = sc.next();
        }

        for(int i=N; i<=N*10; i++){
            String[] s = String.valueOf(i).split("");
            for(int j=0; j<K; j++){
                if(Arrays.asList(s).contains(D[j])){
                    break;
                }
                if(j==K-1){
                    String a = "";
                    for(int k=0; k<s.length; k++){
                        a += s[k];
                    }
                    System.out.println(a);
                    return;
                }
            }
            
        }
        
    }
}