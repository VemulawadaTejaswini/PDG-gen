import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] A = new int[K][N];
        int[] d = new int[K];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<K; i++){
            d[i] = sc.nextInt();
            for(int j=0; j<d[i]; j++){
                A[i][j] = sc.nextInt();
                if(!list.contains(A[i][j])){
                    list.add(A[i][j]);
                }
            }
        }
        System.out.println(N - list.size());
    }
}