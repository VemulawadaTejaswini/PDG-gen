import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by huzhejie on 2016/10/9.
 */
public class Main {
    private static int adjacentMatrix[][];
    private static int vertice,edges,source;
    private static final int INF = 10001;

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
    private static void dijkstra(int dist[]){
        boolean[] flag = new boolean[vertice];
        for (int i = 0; i < vertice; i++) {
            flag[i] = false;
            if(adjacentMatrix[source][i]==INF)
                dist[i] = Integer.MAX_VALUE;
            else
                dist[i] = adjacentMatrix[source][i];
        }
        flag[source] = true;
        dist[source] = 0;
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
            for (int j = 0; j < vertice; j++) {
                int tmp = (adjacentMatrix[k][j]==INF ? Integer.MAX_VALUE: (min + adjacentMatrix[k][j]));
                if (flag[j]==false && tmp<dist[j]) {
                    dist[j] = tmp;
                }
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