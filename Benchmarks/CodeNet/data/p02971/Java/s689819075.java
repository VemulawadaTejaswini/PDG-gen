import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(sc.nextInt());
        }

        for(int i=0; i<N; i++){
            List<Integer> B = new ArrayList<>(A);
            B.remove(i);
            Collections.sort(B, Comparator.reverseOrder());
            println(B.get(0));
        }
    }

    static void println(Object o){
        System.out.println(o);
    }
   static void print(Object o){
        System.out.print(o);
    }
}
