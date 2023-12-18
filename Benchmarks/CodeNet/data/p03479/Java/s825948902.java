import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        long x = Long.parseLong(sc.next());
        long y = Long.parseLong(sc.next());

        long before = x;
        int count = 1;
        int i = 2;

        while(true){
            if(before * i <= y){
                before = before * i;
//                System.out.println(before);
                count++;
//                i++;
            } else {
                break;
            }
        }

//        for(long i=x; i<=y; i++){
//            if(i % before == 0){
//                before = i;
//                count++;
//            }
//        }

        System.out.println(count);
    }

//    void dfs(int from, List<Integer> list, boolean[] reachedNodes){
////        System.out.println(eachCount);
//        int eachCount = 0;
//        for(boolean b: reachedNodes){
//            if(b){
//                eachCount++;
//            }
//        }
//        if(eachCount == N){
//            count++;
//            return;
//        }
////
//        for(int i: list){
//            if(reachedNodes[i]){
//                continue;
//            }
//            reachedNodes[i] = true;
////            System.out.println(String.format("%s %s", from+1, i+1));
//            dfs(i, map.get(i), reachedNodes);
//            reachedNodes[i] = false;
//        }
//    }

//    void dfs(int from, List<Integer> toList, boolean[] eachReachedNode, boolean[][] threwEdge, boolean countedFlug) {
//
//        reachedNode[from] = true;
//        eachReachedNode[from] = true;
//
//        for (int i : toList) {
//            if ((threwEdge[from][i] || threwEdge[i][from])) {
//                continue;
//            } else if(eachReachedNode[i] && !countedFlug){
////                System.out.println(String.format("%s %s", from , i));
//                count++;
//                countedFlug = true;
//                threwEdge[from][i] = true;
//                threwEdge[i][from] = true;
////                return;
//            } else {
//                if(map.get(i) == null){
//                    return;
//                } else {
//                    threwEdge[from][i] = true;
//                    threwEdge[i][from] = true;
//                    dfs(i, map.get(i), eachReachedNode, threwEdge, countedFlug);
//                }
//            }
//        }
//    }
//    void dfs(int from, int to) {
//
//        if (from > 100 || to > 100 || reachedArray[from][to]) {
//            return;
//        }
//
//        reachedArray[from][to] = true;
//
//        if (hasArray[from][to]) {
//            count++;
//        }
//        dfs(to, to + 1);
//        dfs(to + 1, to);
//    }
}
