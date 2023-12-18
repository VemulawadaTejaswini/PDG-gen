import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<List<Integer>> tree = new ArrayList<>();
        for (int i :IntStream.range(0, N-1).toArray()){
            tree.add(Arrays.asList(scan.nextInt(), scan.nextInt()));
        }

        List<Integer> path = dijkstra(tree, N);
        List<Integer> black = new ArrayList<>();
        int blackNum = path.size() / 2 + path.size() % 2;
        for(int i = 0; i < blackNum; i++) {
            black.add(path.get(i));
        }
        int forbidden = path.get(blackNum);
        int blackCount = count(tree,black,forbidden,N);
        if(path.size() % 2 == 0) {
            if(N < blackCount * 2) {
                System.out.println("Fennec");
            }
            else{
                System.out.println("Snuke");
            }
        }
        else {
            if(N < blackCount * 2 + 1) {
                System.out.println("Fennec");
            }
            else{
                System.out.println("Snuke");
            }
        }
    }

    static List<Integer> dijkstra(List<List<Integer>> tree, int N) {
        LinkedList<List<Integer>> stack = new LinkedList<>();
        stack.add(Collections.singletonList(1));
        List<List<Integer>> ret = new ArrayList<>();
        for (int i :IntStream.range(0, N).toArray()){
            List<Integer> current = stack.removeFirst();
            int node = current.get(current.size()-1);
            tree.stream().filter(x -> x.contains(node)).forEach(path ->{
                int next = path.get(0) != node ? path.get(0) : path.get(1);
                if(next == N) {
                    List<Integer> tmp = new ArrayList<>(current);
                    tmp.add(next);
                    ret.add(tmp);
                }
                if(!current.contains(next)) {
                    List<Integer> tmp = new ArrayList<>(current);
                    tmp.add(next);
                    stack.add(tmp);
                }
            });
            if(!ret.isEmpty()) {
                return ret.get(0);
            }
        }
        return null;
    }

    static int count(List<List<Integer>> tree, List<Integer> black, int forbidden, int N) {
        List<Set<Integer>> ret = new ArrayList<>();
        Set<Integer> ans = new HashSet<>();
        ans.addAll(black);
        ret.add(new HashSet<>());
        for (List<Integer> edge : tree) {
            int a = edge.get(0);
            int b = edge.get(1);
            if(a ==forbidden || b == forbidden) {
                break;
            }
            if(ans.contains(a) || ans.contains(b)) {
                ans.add(a);
                ans.add(b);
                for(int i = 0; i < ret.size(); i++) {
                    Set<Integer> tmp = ret.get(i);
                    if(tmp.contains(a) || tmp.contains(b)) {
                        ans.addAll(tmp);
                        ret.remove(i);
                        break;
                    }
                }

            }
            else {
                boolean flag= false;
                for (Set<Integer> tmp : ret) {
                    if (tmp.contains(a) || tmp.contains(b)) {
                        tmp.add(a);
                        tmp.add(b);
                        flag = true;
                        break;
                    }
                }
                if(!flag) {
                    Set<Integer> tmp = new HashSet<>();
                    tmp.add(a);
                    tmp.add(b);
                    ret.add(tmp);
                }
            }
        }
        return ans.size();
    }
}
