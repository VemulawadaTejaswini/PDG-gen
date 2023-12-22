import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by huzhejie on 2016/10/9.
 */
public class Main {
    private static int adjacentMatrix[][];
    private static int vertice,edges,source;

    /**
     * deal with the first line written in the input file
     * @param s
     */
    private static void initMatrix(String s){
        String init[] = s.split(" ");
        try{
            vertice = Integer.parseInt(init[0]);
            edges = Integer.parseInt(init[1]);
            source = Integer.parseInt(init[2]);
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

    private static void inputProcess(String input){
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
     * @param dist  to keep record of the shortest distance between source vertex and target vertices
     */
    @SuppressWarnings("unchecked")
    private static void dijkstra(int dist[]){
//        LinkedList<Node> nodes=new LinkedList<Node>();
//        Node node = new Node(source,0);
//        for(int i = 0;i<vertice;i++)
//            dist[i] = Integer.MAX_VALUE;
//        while(true){
//            for(int j = 0;j<vertice;j++){
//                if(adjacentMatrix[node.getId()][j]!=-1&&adjacentMatrix[node.getId()][j]+node.getLength()<dist[j]){
//                    dist[j] = adjacentMatrix[node.getId()][j]+node.getLength();
//                    Node node1 = new Node(j,dist[j]);
//                    nodes.add(node1);
//                    Collections.sort(nodes);
//                }
//            }
//            if(nodes.isEmpty())
//                break;
//            else
//                node = nodes.poll();
//        }
//        dist[source] = 0;
//        for(int i = 0;i<vertice;i++){
//            if(dist[i]==Integer.MAX_VALUE)
//                System.out.println("INF");
//            else
//                System.out.println(dist[i]);
//        }
        // flag[i]=true??¨???"??¶???vs"??°"??¶???i"??????????????????????????????
        boolean[] flag = new boolean[vertice];

        // ????§????
        for (int i = 0; i < vertice; i++) {
            flag[i] = false;          // ??¶???i?????????????????????????????°???
            dist[i] = adjacentMatrix[source][i];  // ??¶???i??????????????????"??¶???vs"??°"??¶???i"?????????
        }

        // ???"??¶???vs"????????????????§????
        flag[source] = true;
        dist[source] = 0;

        // ??????vertice-1?¬????????¬???????????????¶?????????????????????
        int k=0;
        for (int i = 1; i < vertice; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < vertice; j++) {
                if (flag[j]==false && dist[j]<min) {
                    min = dist[j];
                    k = j;
                }
            }

            flag[k] = true;

            // ?????£??????????????????????????±??¶???
            // ???????????????"??¶???k???????????????"???????????´??°"??????????????????????????¶??????????????????????????±??¶???"???
            for (int j = 0; j < vertice; j++) {
                int tmp = (adjacentMatrix[k][j]==Integer.MAX_VALUE ? Integer.MAX_VALUE : (min + adjacentMatrix[k][j]));
                if (flag[j]==false && tmp<dist[j]) {
                    dist[j] = tmp;
                }
            }
        }

        for (int i=0; i < vertice; i++)
            System.out.println(dist[i]);
    }

    public static void main(String ars[]){

        Scanner sc = new Scanner(System.in);
        int lineCount = 1;
        String str=null;
        initMatrix(sc.nextLine());
        adjacentMatrix = new int[vertice][vertice];
        for (int i = 0;i<vertice;i++){
            Arrays.fill(adjacentMatrix[i],Integer.MAX_VALUE);
        }
        while ((str = sc.nextLine()) != null&&lineCount <= edges) {
            /*
            check and process input data
            */
            inputProcess(str);
            lineCount++;
        }
        sc.close();
        int [] dist = new int[vertice];
        dijkstra(dist);

    }

}
class Node implements Comparable{
    private int id;
    private int length;
    public Node(int id, int length){
        this.id = id;
        this.length = length;
    }
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
    public int getLength() {
        return length;
    }
}