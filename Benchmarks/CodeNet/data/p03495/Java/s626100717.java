import java.util.*;

public class Main{

    private static void Count(int[] A, int K){
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        int kind = 0;
        for(int i = 0; i < A.length; i ++){
            if(!count.containsKey(A[i])){
                count.put(A[i], 1);
                kind ++;                
            } 
            else{
                count.put(A[i], count.get(A[i]) + 1);
            }
        }
        if(kind <= K) System.out.println(0);
        else{
            int[] Value = new int[kind];
            int i = 0;
            for(Integer key : count.keySet()){
                Integer value = count.get(key);
                Value[i] = value;
                i ++;
            }
            Arrays.sort(Value);
            int change = 0;
            for(int j = 0; Value.length - j > K; j ++){
                change += Value[j];
            }
            System.out.println(change);
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i ++){
            A[i] = input.nextInt();
        }
        input.close();
        Count(A, K);
    }
}