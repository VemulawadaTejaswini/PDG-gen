import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();
        
        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];
        
        for(int i = 0; i < X; i++){
            A[i] = sc.nextLong();
        }
        
        for(int i = 0; i < Y; i++){
            B[i] = sc.nextLong();
        }
        
        for(int i = 0; i < Z; i++){
            C[i] = sc.nextLong();
        }        
        
        reverseSort(A);
        reverseSort(B);
        reverseSort(C);

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>( new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                long V = (A[o2[0]] + B[o2[1]] + C[o2[2]]) - (A[o1[0]] + B[o1[1]] + C[o1[2]]);
                return Long.signum(V);
            }
        } );
        
        Set<Long> isDone = new HashSet<>();
        queue.add( new int[]{ 0, 0, 0 });
        isDone.add(makeFlag(0, 0, 0));

        long[] ans = new long[K];
        for(int i = 0; i < K; i++){
            int[] cp = queue.poll();
            int Ai = cp[0];
            int Bi = cp[1];
            int Ci = cp[2];
            
            ans[i] = A[Ai] + B[Bi] + C[Ci];

            if( Ai+1 < X && !isDone.contains(makeFlag(Ai+1, Bi, Ci)) ){                
                queue.add( new int[]{ Ai+1, Bi, Ci } );
                isDone.add( makeFlag(Ai+1, Bi, Ci) );
            }
            
            if( Bi+1 < X && !isDone.contains(makeFlag(Ai, Bi+1, Ci)) ){                             
                queue.add( new int[]{ Ai, Bi+1, Ci } );
                isDone.add( makeFlag(Ai, Bi+1, Ci) );                
            }
            
            if( Ci+1 < X && !isDone.contains(makeFlag(Ai, Bi, Ci+1)) ){                             
                queue.add( new int[]{ Ai, Bi, Ci+1 } );
                isDone.add( makeFlag(Ai, Bi, Ci+1) );                
            }            
        }
        
        StringBuilder sb = new StringBuilder();
        for(long i : ans){
            sb.append(i).append("\r\n");
        }
        System.out.println(sb.toString());
        
    }
    
    static long makeFlag(int a, int b, int c){
        return (long)1e6 * a + (long)1e3 * b + c;
    }
    
    static void reverseSort(long[] L){
        Arrays.sort(L);
        int len = L.length;
        for(int i = 0; i < len/2; i++){
            long tmp = L[i];
            L[i] = L[len-1-i];
            L[len-1-i] = tmp;
        }
    }
}
