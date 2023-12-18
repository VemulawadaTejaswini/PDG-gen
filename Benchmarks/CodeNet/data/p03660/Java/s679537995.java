import java.util.*;
import java.io.*;


public class Main{

    public static Node[] nodes;
    public static ArrayList<Node> fennecCanColor, snukeCanColor;
    public static boolean[] colored;

    public static void main(String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        nodes = new Node[n+1];
        colored = new boolean[n+1];
        fennecCanColor = new ArrayList<Node>();
        snukeCanColor = new ArrayList<Node>();

        for(int i = 1; i <= n; i++){
            nodes[i] = new Node();
            nodes[i].num = i;
        }

        colored[1] = true;
        colored[n] = true;

        for(int i = 1; i < n; i++){
            String[] input = in.readLine().split("\\s+");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            nodes[a].adjList.add(nodes[b]);
            nodes[b].adjList.add(nodes[a]);

            nodes[a].canColorSize++;
            nodes[b].canColorSize++;

            if(a == 1 || a == n){
                nodes[b].canColorSize--;
            }

            if(b == 1 || b == n){
                nodes[a].canColorSize--;
            }

            if(a == 1 && b != n){
                fennecCanColor.add(nodes[b]);
                nodes[b].added++;
            }
            else if(a == n && b != 1){
                snukeCanColor.add(nodes[b]);
                nodes[b].added++;
            }

            if(b == 1 && a != n){
                fennecCanColor.add(nodes[a]);
                nodes[a].added++;
            }
            else if(b == n && a != 1){
                snukeCanColor.add(nodes[a]);
                nodes[a].added++;
            }
        }

        Collections.sort(fennecCanColor);
        Collections.sort(snukeCanColor);

        boolean fennec = true;;

        while(play(fennec)){
            fennec = !fennec;
        }

        if(fennec){
            out.println("Snuke");
        }
        else{
            out.println("Fennec");
        }

        in.close();
        out.close();
    }

    public static boolean play(boolean fennec){
        if(fennec){
            return playFennec();
        }
        return playSnuke();
    }

    public static boolean playFennec(){

        int size = fennecCanColor.size();

        if(size == 0){
            return false;
        }

        Node tmpNode = fennecCanColor.get(0);
        //System.out.println("Fennec colors: " + tmpNode.num);
        colored[tmpNode.num] = true;
        addAdjList(tmpNode.num, true);
        if(tmpNode.added > 1){
            snukeCanColor.remove(tmpNode);
        }
        fennecCanColor.remove(tmpNode);

        return true;

    }

    public static boolean playSnuke(){

        int size = snukeCanColor.size();

        if(size == 0){
            return false;
        }

        Node tmpNode = snukeCanColor.get(0);
        //System.out.println("Snuke colors: " + tmpNode.num);
        colored[tmpNode.num] = true;
        addAdjList(tmpNode.num, false);
        if(tmpNode.added > 1){
            fennecCanColor.remove(tmpNode);
        }
        snukeCanColor.remove(tmpNode);

        return true;
        
    }

    public static void addAdjList(int num, boolean fennec){
        if(fennec){
            for(Node node : nodes[num].adjList){
                node.canColorSize--;
                if(!colored[node.num]){
                    //System.out.println("\tFennec adds: " + node.num);
                    node.added++;
                    fennecCanColor.add(node);
                }
            }
        }
        else{
            for(Node node : nodes[num].adjList){
                node.canColorSize--;
                if(!colored[node.num]){
                    //System.out.println("\tSnuke adds: " + node.num);
                    node.added++;
                    snukeCanColor.add(node);
                }
            }
        }

        Collections.sort(fennecCanColor);
        Collections.sort(snukeCanColor);
    }
}

class Node implements Comparable<Node> {

    public int num;
    public int added;
    public int canColorSize;
    public ArrayList<Node> adjList;

    public Node(){
        adjList = new ArrayList<Node>();
        canColorSize = 0;
        added = 0;
    }

    @Override
    public int compareTo(Node n){
        if(this.added > n.added)
            return -1;
        if(n.added > this.added)
            return 1;
        return -1 * Integer.compare(this.canColorSize, n.canColorSize);
    }

}