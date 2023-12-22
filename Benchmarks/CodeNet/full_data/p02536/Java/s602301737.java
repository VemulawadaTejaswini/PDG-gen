import java.util.*;

public class Main {
    
    public static boolean[] alr;
    
    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        alr = new boolean[N];
        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt()-1;
            int B = sc.nextInt()-1;
            list.get(A).add(B);
            list.get(B).add(A);
        }
        long count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (alr[i]) {
                continue;
            } else {
                alr[i] = true;
                count++;
            }
            List<Integer> lst = list.get(i);
            count(lst);
        }
        System.out.println(count-1);
    }
    
    private static void count(List<Integer> lst) {
        int friends = 0;
        for (Integer i : lst) {
            if (alr[i]) {
                continue;
            } else {
                alr[i] = true;
            }           
            count(list.get(i));
        }
    }
}
