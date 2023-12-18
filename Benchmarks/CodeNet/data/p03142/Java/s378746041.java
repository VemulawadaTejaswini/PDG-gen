
import java.util.*;

import static java.lang.System.*;

// https://ja.wikipedia.org/wiki/%E3%83%88%E3%83%9D%E3%83%AD%E3%82%B8%E3%82%AB%E3%83%AB%E3%82%BD%E3%83%BC%E3%83%88
// O(N+M)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, List<Integer>> nodeToNodes = new HashMap<Integer, List<Integer>>();  //ノードから伸びるノードリスト
        for (int i = 0; i < N - 1 + M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            List<Integer> toNodes = new ArrayList<Integer>();
            if (nodeToNodes.containsKey(a)) {
                toNodes = nodeToNodes.get(a);
            }
            toNodes.add(b);
            nodeToNodes.put(a, toNodes);
        }

        // トポロジカルソートの準備
        Map<Integer, List<Integer>> nodesParents = new HashMap<Integer, List<Integer>>();  //ノードの親
        for(Map.Entry<Integer, List<Integer>> nodeToNode: nodeToNodes.entrySet()){
            int parent = nodeToNode.getKey();
            List<Integer> kids = nodeToNode.getValue();

            for(int k: kids){
                List<Integer> toParents = new ArrayList<Integer>();
                if (nodesParents.containsKey(k)) {
                    toParents = nodesParents.get(k);
                }
                toParents.add(parent);
                nodesParents.put(k, toParents);
            }
        }

        //for(Map.Entry<Integer, List<Integer>> nodeParents: nodesParents.entrySet()){
        //    int node = nodeParents.getKey();
        //    List<Integer> parents = nodeParents.getValue();

        //    out.println(node+"=>");
        //    for(int n: parents){
        //        out.print(n+",");
        //    }
        //    out.println();
        //}

        // 親がいない
        Queue<Integer> noParents  = new ArrayDeque<Integer>();
        for(int n = 1; n < N; n++){
            if (!nodesParents.containsKey(n)){
                noParents.add(n);
            }
        }

        // トポロジカルソート
        int[] answer = new int[N+1];
        Arrays.fill(answer, -1);

        while(!noParents.isEmpty()){
            int p = noParents.poll();
            if(answer[p] == -1){ answer[p] = 0; }

            //out.println(p);

            // 親から順番に特定する
            if(nodeToNodes.containsKey(p)) {
                List<Integer> toNodes = nodeToNodes.get(p);
                for (int toNode : toNodes) {
                    List<Integer> parents = nodesParents.get(toNode);
                    parents.remove(parents.indexOf(p));

                    // もし親がいないならキューに追加
                    if (parents.size() == 0) {
                        answer[toNode] = p;
                        noParents.add(toNode);
                        nodesParents.remove(nodesParents.remove(toNode));
                    } else {
                        nodesParents.put(toNode, parents);
                    }
                }
            }
        }

        for(int n = 1; n <= N; n++) {
            out.println(answer[n]);
        }
    }
}