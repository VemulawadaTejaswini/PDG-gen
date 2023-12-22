import java.util.*;
public class Main {
	public static void main(String[] args){
        Main main = new Main();
        main.input();
        main.solve();
        main.output();
    }

    int N;
    int M;
    int[] A;
    int[] B;
    List<Set<Integer>> groups;
    int result;

    private void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[M];
        B = new int[M];
        groups = new ArrayList<>();
        for (int i=0; i<M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            Set<Integer> s = new HashSet<>();
            s.add(i+1);
            groups.add(s);
        }
        result = 1;
    }

    private void solve() {
        for (int i=0; i<M; i++) {
            // debug();
            Set<Integer> groupA = null;
            Set<Integer> groupB = null;
            for (Set<Integer> g : groups) {
                if (g.contains(A[i])) {
                    groupA = g;
                }
                if (g.contains(B[i])) {
                    groupB = g;
                }
                if (groupA != null && groupB != null) {
                    groups.remove(groupA);
                    groups.remove(groupB);
                    Set<Integer> groupAandB = merge(groupA, groupB);
                    if (groupAandB.size() > result) {
                        result = groupAandB.size();
                    }
                    groups.add(groupAandB);
                    break;
                }
            }
        }
    }

    private Set<Integer> merge(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> result = new HashSet<>();
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }

    private void output() {
        System.out.println(result);
    }
    
    private void debug() {
        System.out.println("result=" + result);
        for (Set<Integer> g : groups) {
            System.out.println("group_start");
            for (Integer i : g) {
                System.out.println(i);
            }
            System.out.println("group_end");
        }
    }

}
