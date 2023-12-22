import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by huzhejie on 2016/10/9.
 */
public class Main {
    private int adjacentMatrix[][];
    private int vertice,edges,source;

    /**
     * deal with the first line written in the input file
     * @param s
     */
    private void initMatrix(String s){
        String init[] = s.split(" ");
        try{
            vertice=Integer.parseInt(init[0]);
            edges = Integer.parseInt(init[1]);
            source = Integer.parseInt(init[2]);
            adjacentMatrix = new int[vertice][vertice];
            for (int i = 0;i<vertice;i++){
                Arrays.fill(adjacentMatrix[i],-1);
            }
        }catch (NumberFormatException e){
            System.out.println("You have to input positive numbers!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("You have missed something when doing input!");
        }

    }

    /**
     * deal with the lines(sourceVertex targetVertex distance) written in the input file
     * @param input
     */

    private void inputProcess(String input){
        String line[] = input.split(" ");
        try {
            int sourceVertex = Integer.parseInt(line[0]);
            int targetVertex = Integer.parseInt(line[1]);
            int distance = Integer.parseInt(line[2]);
            adjacentMatrix[sourceVertex][targetVertex] = distance;
        }catch (IndexOutOfBoundsException e){
            System.out.println("You have missed something when doing input!");
        }catch (NumberFormatException e){
            System.out.println("You have to input positive numbers!");
        }
    }

    /**
     *
     * @param adjacentMatrix  adjacent Matrix
     * @param source  source vertex number
     * @param dist  to keep record of the shortest distance between source vertex and target vertices
     */

    private void dijkstra(int[][] adjacentMatrix,int source,int dist[]){
        LinkedList<Node> nodes=new LinkedList<Node>();
        Node node = new Node(source,0);
        for(int i = 0;i<vertice;i++)
            dist[i] = 10000;
        while(true){
            for(int j = 0;j<vertice;j++){
                if(adjacentMatrix[node.getId()][j]!=-1&&adjacentMatrix[node.getId()][j]+node.getLength()<dist[j]){
                    dist[j] = adjacentMatrix[node.getId()][j]+node.getLength();
                    Node node1 = new Node(j,dist[j]);
                    nodes.add(node1);
                    Collections.sort(nodes);
                }
            }
            if(nodes.isEmpty())
                break;
            else
                node = nodes.poll();
        }
        dist[source] = 0;
        for(int i = 0;i<vertice;i++){
            if(dist[i]==10000)
                System.out.println("INF");
            else
                System.out.println(dist[i]);
        }

    }

    public static void main(String ars[]){
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int lineCount = 0;
        String str;
            while ((str = sc.nextLine()) != null) {
            /*
            check and process input data
            */
                if (lineCount > 0 && lineCount <= m.edges)
                    m.inputProcess(str);
                else if (lineCount > m.edges) {
                    sc.close();
                    break;
                } else
                    m.initMatrix(str);
                lineCount++;
            }
        int [] dist = new int[m.vertice];
        m.dijkstra(m.adjacentMatrix,m.source,dist);

    }

}
class Node implements Comparable{
    private int id;
    private int length;
    public Node(int id, int length){
        this.id = id;
        this.length = length;
    }
    @Override
    public int compareTo(Object o){
        int l = ((Node)o).length;
        if(l>length)
            return -1;
        if(l==length)
            return 0;
        return 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}