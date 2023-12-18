import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(Integer.parseInt(sc.next()));
        }

        List<Integer> B;
        int[] C = new int[N];
        for(int i=0; i<N; i++){
            B = new ArrayList<>(A);
            B.remove(i);
            Collections.sort(B, Comparator.reverseOrder());
            C[i] = B.get(0);
        }

        for(int i=0; i<N; i++){
            println(C[i]);
        }
    }

    static void println(Object o){
        System.out.println(o);
    }
   static void print(Object o){
        System.out.print(o);
    }
}
