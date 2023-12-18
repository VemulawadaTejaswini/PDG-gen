import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    execute(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }

    public static void execute(int size,int from,int to){
        int adjacencyMatrix[][] = new int[size][size];
        for(int i = 0;i < size ; i++ ){
            for(int j = 0;j < size ; j++ ){
                int adjacency = size;
                if(j - i == 1 || i - j == 1){
                    adjacency = 1;
                }
                if(i == from - 1 && j == to - 1){
                    adjacency = 1;
                }
                if(j == from - 1 && i == to - 1){
                    adjacency = 1;
                }
                if(i == j){
                    adjacency = 0;
                }
                adjacencyMatrix[i][j] = adjacency;
            }
        }

        for(int k = 0; k < size ; k++){
            for(int i = 0;i < size ; i++ ){
                for(int j = 0;j < size ; j++ ){
                    adjacencyMatrix[i][j] = Math.min(
                            adjacencyMatrix[i][j],
                            adjacencyMatrix[i][k]+adjacencyMatrix[k][j]);
                }
            }
        }

        Map<Integer,Integer> countMap = new TreeMap<>();
        for(int i = 1; i <= size - 1 ; i++){
            countMap.put(i,0);
        }

        for(int i = 0;i < size ; i++ ){
            for(int j = 0;j < size ; j++ ){
                Integer distanceResult = adjacencyMatrix[i][j];
                if(distanceResult != 0){
                    int count = countMap.get(distanceResult);
                    count++;
                    countMap.put(distanceResult,count);

                }
            }
        }
        for(Map.Entry<Integer,Integer> countEntry : countMap.entrySet()){
            System.out.println(countEntry.getValue() / 2);
        }

    }

}
