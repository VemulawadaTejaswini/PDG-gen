import java.util.*;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        String[] S = sc.next().split("");
        int res = 0;
        
        for(int i = 0; i < N; ++i){
            for(int j = i; j < N; ++j){
                for(int k = j; k < N; ++k){
                    if(!S[i].equals(S[j]) && !S[i].equals(S[k]) && !S[j].equals(S[k])) {
                        if((j - i) != (k - j)) {
                            res++;
                        }
                    }
                }
 
            }
        }
        System.out.println(res);
    }
    
}