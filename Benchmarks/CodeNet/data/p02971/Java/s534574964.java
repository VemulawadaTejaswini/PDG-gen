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
        for(int i=0; i<N; i++){
            B = new ArrayList<>(A);
            B.remove(i);
            Integer[] C = B.toArray(new Integer[N-1]);
            Arrays.sort(C);
            println(C[C.length-1]);
        }
    }

    static void println(Object o){
        System.out.println(o);
    }
   static void print(Object o){
        System.out.print(o);
    }
}
