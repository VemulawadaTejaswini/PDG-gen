import java.util.*;
import java.io.*;


public class Main{

    public static Node[] nodes;
    public static PriorityQueue<Node> fennecCanColor, snukeCanColor;
    public static boolean[] colored;

    public static void main(String[] args) throws Exception{
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int n = Integer.parseInt(in.readLine());

        nodes = new Node[n+1];
        colored = new boolean[n+1];
        fennecCanColor = new PriorityQueue<Node>();
        snukeCanColor = new PriorityQueue<Node>();

        for(int i = 1; i <= n; i++){
            nodes[i] = new Node();
            nodes[i].num = i;
        }

        for(int i = 1; i < n; i++){
            String[] input = in.readLine().split("\\s+");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            nodes[a].adjList.add(nodes[b]);
            nodes[b].adjList.add(nodes[a]);

            if(a == 1 && b != n){
                fennecCanColor.add(nodes[b]);
            }
            else if(a == n && b != 1){
                snukeCanColor.add(nodes[b]);
            }

            if(b == 1 && a != n){
                fennecCanColor.add(nodes[a]);
            }
            else if(b == n && a != 1){
                snukeCanColor.add(nodes[a]);
            }
        }

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

        if(fennecCanColor.size() == 0){
            return false;
        }

        boolean canColor = false;

        ArrayList<Node> tmp = new ArrayList<Node>();

        while(fennecCanColor.size() > 0){
            Node tmpNode = fennecCanColor.poll();
            if(snukeCanColor.contains(tmpNode)){
                //System.out.println("\tFennec colors: " + tmpNode.num);
                canColor = true;
                addAdjList(tmpNode.num, true);
                break;
            }
            tmp.add(tmpNode);
        }

        for(Node node : tmp){
            fennecCanColor.add(node);
        }

        if(!canColor){
            Node tmpNode = fennecCanColor.poll();
            //System.out.println("\tFennec colors: " + tmpNode.num);
            canColor = true;
            addAdjList(tmpNode.num, true);
        }

        return canColor;
    }

    public static boolean playSnuke(){

        if(snukeCanColor.size() == 0){
            return false;
        }

        boolean canColor = false;

        ArrayList<Node> tmp = new ArrayList<Node>();

        while(snukeCanColor.size() > 0){
            Node tmpNode = snukeCanColor.poll();
            if(fennecCanColor.contains(tmpNode)){
                //System.out.println("\tSnuke colors: " + tmpNode.num);
                canColor = true;
                addAdjList(tmpNode.num, true);
                break;
            }
            tmp.add(tmpNode);
        }

        for(Node node : tmp){
            snukeCanColor.add(node);
        }

        if(!canColor){
            Node tmpNode = snukeCanColor.poll();
            //System.out.println("\tSnuke colors: " + tmpNode.num);
            canColor = true;
            addAdjList(tmpNode.num, true);
        }

        return canColor;
    }

    public static void addAdjList(int num, boolean fennec){
        if(fennec){
            for(Node node : nodes[num].adjList){
                if(!colored[node.num]){
                    fennecCanColor.add(node);
                }
            }
        }
        else{
            for(Node node : nodes[num].adjList){
                if(!colored[node.num]){
                    snukeCanColor.add(node);
                }
            }
        }
    }
}

class Node implements Comparable<Node> {

    public int num;
    public ArrayList<Node> adjList;

    public Node(){
        adjList = new ArrayList<Node>();
    }

    @Override
    public int compareTo(Node n){
        return -1 * Integer.compare(this.adjList.size(), n.adjList.size());
    }

}