import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next());

        int M = Integer.parseInt(scan.next());

        int length = (N > M)? M:N;

        List<Integer>[] pArray = new List[length];
        int[] P = new int[length];
        int[] Y = new int[length];

        for(int i =0; i<M; i++){

            P[i] = Integer.parseInt(scan.next());
            Y[i] = Integer.parseInt(scan.next());

            List<Integer> yList;

            if( pArray[P[i]] == null) {
                
                yList = new ArrayList<>();
                yList.add(Y[i]);
                
                pArray[P[i]] = yList;
                
            }else{
                
                pArray[P[i]].add(Y[i]);
            }
        }

        for(int i =0; i<N; i++){
            Collections.sort( pArray[P[i]]);
        }

        int found ;
        for(int i =0; i<M ; i++){
            found = Collections.binarySearch( pArray[P[i]], Y[i]);
            System.out.println(String.format("%06d", P[i]) + String.format("%06d", found + 1));
        }
    }
}