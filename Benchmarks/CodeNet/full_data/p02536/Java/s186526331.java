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
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (alr[i]) {
                continue;
            } else {
                alr[i] = true;
            }
            List<Integer> lst = list.get(i);
            int count = count(lst);
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
    
    private static int count(List<Integer> lst) {
        int friends = 0;
        for (Integer i : lst) {
            if (alr[i]) {
                continue;
            } else {
                alr[i] = true;
                friends++;
            }           
            friends += count(list.get(i));
        }
        return friends;
    }
}
