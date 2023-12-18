import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++) {
            ArrayList<Integer> add = new ArrayList<Integer>();
            list.add(add);
        }
        int[] P = new int[M];
        int[] Y = new int[M];
        for (int i=0;i<M;i++) {
            P[i] = sc.nextInt()-1;
            Y[i] = sc.nextInt();
            list.get(P[i]).add(Y[i]);
        }
        for (int i=0;i<N;i++) {
            ArrayList<Integer> tmp = list.get(i);
            Collections.sort(tmp);
        }

        for (int i=0;i<M;i++) {
            int index = Collections.binarySearch(list.get(P[i]), Y[i]);
            System.out.printf("%06d", P[i]+1);
            System.out.printf("%06d", index+1);
            System.out.println("");
        }
    }
}