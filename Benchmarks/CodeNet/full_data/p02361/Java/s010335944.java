import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by huzhejie on 2016/10/9.
 */
public class Main {
    private static int adjacentMatrix[][];
    private static int vertice,edges,source;
    private static final int INF = 10001;

    private static void initMatrix(String s){
        String init[] = s.split(" ");
        try{
            vertice = Integer.parseInt(init[0]);
            edges = Integer.parseInt(init[1]);
            source = Integer.parseInt(init[2]);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }

    private static void inputProcess(String input){
        String line[] = input.split(" ");
        try {
            int sourceVertex = Integer.parseInt(line[0]);
            int targetVertex = Integer.parseInt(line[1]);
            int distance = Integer.parseInt(line[2]);
            adjacentMatrix[sourceVertex][targetVertex] = distance;
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    private static void dijkstra(int dist[]){
        LinkedList<Heapnode> nodes=new LinkedList<Heapnode>();//??¨LinkedList?????¨????°????
        Heapnode enode=new Heapnode(source,0);
        for(int j=0;j<vertice;j++){
            dist[j]=Integer.MAX_VALUE;
        }
        while(true){//????´¢????¢??§£?????´
            for(int j=0;j<vertice;j++){
                if(adjacentMatrix[enode.id][j]!=INF&&enode.length+adjacentMatrix[enode.id][j]<dist[j]){
                    dist[j]=enode.length+adjacentMatrix[enode.id][j];
                    Heapnode e=new Heapnode(j,dist[j]);
                    nodes.add(e);
                    Collections.sort(nodes);
                }
            }
            //????????????????±???????
            if(nodes.isEmpty())
                break;
            else{
                enode= nodes.poll();
            }

        }

        for (int i=0; i < vertice; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.println("INF");
            else
                System.out.println(dist[i]);
        }
    }

    public static void main(String ars[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = 1;
        String str=null;
        try {
            initMatrix(br.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }
        adjacentMatrix = new int[vertice][vertice];
        for (int i = 0;i<vertice;i++){
            Arrays.fill(adjacentMatrix[i],INF);
        }
        try {
            while ((str = br.readLine()) != null && lineCount <= edges) {
            /*
            check and process input data
            */
                inputProcess(str);
                lineCount++;
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        int [] dist = new int[vertice];
        dijkstra(dist);
    }

}
 class Heapnode implements Comparable{
    int id;//??¶?????????
    int length;//????????????
    public Heapnode(int ii,int ll){
        id=ii;
        length=ll;
    }
    public int compareTo(Object x) {
        float xl=((Heapnode)x).length;
        if(length<=xl) return -1;
        return 1;
    }
}