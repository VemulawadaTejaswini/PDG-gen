import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String[] S = new String[N];
        int[] P = new int[N];
        
        for(int i = 0 ; i < N; i++){
            S[i] = sc.next();
            P[i] = sc.nextInt();
        }
        int[] key = new int[N];
        for(int i = 0; i < N; i++){
            int count = 1;
            for(int j = 0; j < N; j++){
                if(S[i].compareTo(S[j]) > 0){
                    count++;
                }else if(S[i].compareTo(S[j]) == 0){
                    if(P[i] < P[j]){
                        count++;
                    }
                }
            }
            key[i] = count;
        }
        
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i = 0; i < N; i++){
            map.put(key[i], i+1);
        }
        
        for(Integer val : map.values()){
            System.out.println(val);
        }
    }
}