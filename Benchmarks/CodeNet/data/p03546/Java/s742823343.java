import java.util.*;

class Main {
    private static int[][] c = new int[10][10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = scanner.nextInt();
            }
        }

        AllPairShortestPath all = new AllPairShortestPath(c.length);
        all.allPairShortestPath(c);
        int mp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int num = scanner.nextInt();
                if (num != -1)mp += all.distancematrix[num][1];
            }
        }
        System.out.println(mp);
    }
}

class AllPairShortestPath {
    int distancematrix[][];
    private int numberofvertices;
//    public static final int INFINITY = 1001;
    AllPairShortestPath(int numberofvertices) {
        distancematrix = new int[numberofvertices][numberofvertices];
        this.numberofvertices = numberofvertices;
    }
    void allPairShortestPath(int adjacencymatrix[][]){
        for (int source = 0; source < numberofvertices; source++) {
            System.arraycopy(adjacencymatrix[source], 0, distancematrix[source], 0, numberofvertices);
        }
        for (int intermediate = 0; intermediate < numberofvertices; intermediate++) {
            for (int source = 0; source < numberofvertices; source++)
            {
                for (int destination = 0; destination < numberofvertices; destination++)
                {
                    if (distancematrix[source][intermediate] + distancematrix[intermediate][destination]
                            < distancematrix[source][destination])
                        distancematrix[source][destination] = distancematrix[source][intermediate]
                                + distancematrix[intermediate][destination];
                }
            }
        }
    }
}
