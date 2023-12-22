import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final int M = sc.nextInt();
        
        final Set<Integer>[] friends = new Set[N];
        for (int i = 0; i < N; i++) {
            friends[i] = new HashSet<>();
        }
        
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            
            friends[a].add(b);
            friends[b].add(a);
        }
        
        TreeSet<Integer> members = new TreeSet<>(
                IntStream.range(0, N).mapToObj(Integer::valueOf).collect(Collectors.toSet()));
        
        int max = 0;
        while (!members.isEmpty()) {
            int m = members.pollFirst();
            Queue<Integer> tmp = new ArrayDeque<>();
            tmp.add(m);
            Set<Integer> group = new HashSet<>();
            
            while (!tmp.isEmpty()) {
                int n = tmp.poll();
                group.add(n);
                friends[n].retainAll(members);
                tmp.addAll(friends[n]);
                members.removeAll(friends[n]);
            }
            
            if (max < group.size()) {
                max = group.size();
            }
        }
        
        System.out.println(max);
    }
}
