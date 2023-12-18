import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, M, X;
        String str[] = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        X = Integer.parseInt(str[2]);
        int algo[][] = new int[M][N];
        int cost[] = new int[N];
        Map<Double, Integer> map = new HashMap<>();
        double avg[] = new double[N];
        for(int i=0; i<N; i++){
            str = br.readLine().split(" ");
            cost[i] = Integer.parseInt(str[0]);
           for (int j=0; j<M; j++){
                algo[i][j] = Integer.parseInt(str[j+1]);
                avg[i] = avg[i] + algo[i][j];
           }
           avg[i] = cost[i]/avg[i];
           map.put(avg[i], i);
        }
        Arrays.sort(avg);
        int sum = 0;
        int totalCost = 0;
        for(int i=0; i<avg.length; i++){
            if(map.containsKey(avg[i])){
                int index = map.get(avg[i]);
                int temp[] = algo[index];
                Arrays.sort(temp);
                int min = temp[0];
                sum+=min;
                totalCost += cost[index];
                if(sum>=X){
                    break;
                }
            }
        }
        System.out.println(totalCost);
    }
}