import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int i=0;i<S.length-1;i++){
          char[] SS = new char[S.length-i];
          for (int j=0;j<S.length-i;j++){
            SS[j] = S[j+i];
          }
          pq.add(Zalgo(SS));
        }
        System.out.println(pq.poll());
    }
    public static int Zalgo(char[] S){
        int N = S.length;
        int[] A = new int[N];
        A[0] = N;
        int i = 1;
        int j = 0;
        while(i<N){
            while(i+j < N && S[j] == S[i+j]){
                j++;
            }
            A[i] = j;
            if(j==0){
                i++;
                continue;
            }
            int k = 1;
            while(i+k<N&& k  + A[k] < j){
                A[i+k] = A[k];
                k++;
            }
            i += k;
            j -= k;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int l=0;l<N;l++){
            if(A[l]<=l){
              pq.add(A[l]);
            }
        }
        return pq.poll();
    }
    //char[] →　Character[]
    public static Character[] LIBctoC(char[] c){
        int size = c.length;
        Character[] C = new Character[size];
        for (int i = 0;i<size;i++){
            C[i] = Character.valueOf(c[i]);
        }
        return C;
    }
}