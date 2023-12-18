import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Long> bc = new ArrayList<>();

        for (int i=0; i<N; i++){
            bc.add(sc.nextLong());
        }
        int[] B = new int[N];
        long[] C = new long[N];
        for (int i=0; i < M; i++){
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }
        sc.close();

        for (int i=0; i<M; i++){
            for (int j=0; j<B[i]; j++){
                bc.add(C[i]);
            }
        }

        Collections.sort(bc, Comparator.reverseOrder());

        long result=0;
        for (int i=0; i<N; i++){
            result += bc.get(i);
        }

        System .out.println(result);

    }
}