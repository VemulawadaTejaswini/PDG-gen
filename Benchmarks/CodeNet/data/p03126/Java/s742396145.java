import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String,Integer>();
        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");
        int N = Integer.parseInt(tempArr[0]);
        int M = Integer.parseInt(tempArr[1]);

        for (int m = 0; m < M; m++) {
            map.put((m + 1) + "", 0);
        }

        for (int n = 0; n < N; n++) {
            temp = sc.nextLine();
            tempArr = temp.split(" ");
            int K = Integer.parseInt(tempArr[0]);
            for (int k = 1; k <= K; k++) {
                map.put(Integer.parseInt(tempArr[k]) + "", map.get(Integer.parseInt(tempArr[k]) + "") + 1);
            }
        }

        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == N) {
                count++;
            }
        }

        System.out.println(count);


    }

}
