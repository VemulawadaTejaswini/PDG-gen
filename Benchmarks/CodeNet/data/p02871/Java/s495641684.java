import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    
    static int V;
    static int[] deliver;
    static ArrayDeque<Move> path;
    static int[][] dist;
    static int[][] next;
    static Map<Integer, List<Node>> nodeList;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        V = Integer.parseInt(sc.next());
        int E = Integer.parseInt(sc.next());
        
        dist = new int[V+1][V+1];
        final int INF = Integer.MAX_VALUE / 10;
        for(int i = 1; i <= V; i++){
            Arrays.fill(dist[i], INF);
        }
        
        for(int i = 0; i < E; i++){
            int u = Integer.parseInt(sc.next());
            int v = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            dist[u][v] = d;
            dist[v][u] = d;
        }
        next = new int[V+1][V+1];
        for(int i = 1; i <= V; i++){
            for(int j = 1; j <= V; j++){
                next[i][j] = j;
            }
        }
        for(int k = 1; k <= V; k++){
            for(int i = 1; i <= V; i++){
                for(int j = 1; j <= V; j++){
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }
        
        nodeList = new HashMap<>();
        for(int i = 1; i <= V; i++){
            List<Node> list = new ArrayList<>();
            for(int j = 1; j <= V; j++){
                if(i != j) list.add(new Node(j, dist[i][j]));
            }
            Collections.sort(list);
            nodeList.put(i, list);
        }
        
        int tMax = Integer.parseInt(sc.next());
        int[] info = new int[tMax];
        for(int t = 0; t < tMax; t++){
            int nNew = Integer.parseInt(sc.next());
            if(nNew == 1){
                int id = Integer.parseInt(sc.next());
                info[t] = Integer.parseInt(sc.next());
            }
        }
        
        final int SHOP = 1;
        final int EDGE = 0;
        long maxScore = 0;
        StringBuilder bestCommand = new StringBuilder();
        
        for(int a = 1; a < 500; a++){
            for(int b = 0; b < 30; b++){
                ArrayDeque<Integer> order = new ArrayDeque<>();
                int orderNum = 0;
                deliver = new int[V+1];
                int deliverNum = 0;
                int pos = 1;
                path = new ArrayDeque<>();
                StringBuilder command = new StringBuilder();
                boolean returnToShop = false;
                Map<Integer, ArrayDeque<Integer>> orderedTime = new HashMap<>();
                for(int i = 2; i <= V; i++){
                    orderedTime.put(i, new ArrayDeque<>());
                }
                long score = 0;
                
                for(int t = 0; t < tMax; t++){
                    if(info[t] != 0){
                        order.add(info[t]);
                        orderNum++;
                        orderedTime.get(info[t]).addLast(t);
                    }
                    if(!path.isEmpty()){
                        if(path.peek().cost == 1){
                            pos = path.poll().to;
                        }else{
                            path.peek().cost--;
                            pos = EDGE;
                        }
                    }
                    if(t == (9100 + b*20) && b >= 1) returnToShop = true;

                    if(pos == SHOP){
                        path.clear();
                        while(!order.isEmpty()){
                            deliver[order.poll()]++;
                            deliverNum++;
                        }
                        orderNum = 0;
                        if(deliverNum == 0){
                            command.append(-1);
                        }else{
                            setPath(pos, -1);
                            command.append(path.peek().to);
                        }
                    }else if(pos == EDGE){
                        command.append(path.peek().to);
                    }else{
                        if(deliver[pos] != 0){
                            deliverNum -= deliver[pos];
                            for(int i = 0; i < deliver[pos]; i++){
                                int waitingTime = t - orderedTime.get(pos).poll();
                                score += tMax * tMax - waitingTime * waitingTime;
                            }
                            deliver[pos] = 0;
                        }
                        if(returnToShop){
                            path.clear();
                            setPath(pos, SHOP);
                            returnToShop = false;
                        }else if(path.isEmpty()){
                            if(deliverNum == 0 || orderNum*50 > deliverNum*a){
                                setPath(pos, SHOP);
                            }else{
                                setPath(pos, -1);
                            }
                        }
                        command.append(path.peek().to);
                    }
                    command.append(System.lineSeparator());
                }
                if(score > maxScore){
                    maxScore = score;
                    bestCommand = command;
                }
            }
        }
        
        System.out.print(bestCommand);
    }
    
    static void setPath(int from, int to){
        
        if(to == -1){
            for(Node n : nodeList.get(from)){
                if(deliver[n.id] != 0){
                    to = n.id;
                    break;
                }
            }
        }
        int v = from;
        while(v != to){
            path.addLast(new Move(next[v][to], dist[v][next[v][to]]));
            v = next[v][to];
        }
    }
    
    static class Node implements Comparable<Node>{
        int id;
        int dist;

        public Node(int id, int dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node n) {
            return this.dist - n.dist;
        }
    }
    
    static class Move {
        int to;
        int cost;

        public Move(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}