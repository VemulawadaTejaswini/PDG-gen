import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() - 1;
        int[][] stationData = new int[n][3];
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            int first = sc.nextInt();
            int freq = sc.nextInt();
            stationData[i] = new int[]{length, first, freq};
        }
        
        for (int i = 0; i < n - 1; i++) {
            int time = 0;
            time += stationData[i][0] + stationData[i][1];
            for (int j = i + 1; j < n; j++) {
                int a = time - stationData[j][1];
                if (a < 0) {
                    time = stationData[j][1] + stationData[j][0];
                    continue;
                }
                int b = a % stationData[j][2] == 0 ? 0 : (a / stationData[j][2] + 1);
                time = time + b + stationData[j][0];
            }
            System.out.println(time);
        }
        
        System.out.println(stationData[n - 1][0] + stationData[n - 1][1]);
        System.out.println("0");
    }
}
