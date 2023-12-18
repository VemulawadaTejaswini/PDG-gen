import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        int N; //= 10; //; // =
        //int[] sticks = {3, 3, 3, 3, 4, 4, 4, 5, 5, 5, 7,7,7,7,7}; // {3,1,2,4,2,1};
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] sticks = new int[N];
        for (int i=0; i<N; i++){
            sticks[i] = sc.nextInt();
        }

        int area = makeRect(N, sticks);
        System.out.println(area);
    }

    private static int makeRect(int n, int[] sticks) {;
        int area = 0, max1 = 0, max2 = 0, temp = 0;
        if (n < 4)
            System.out.println("insufficient stick");
        else {
            TreeMap<Integer, Integer> stickPair = new TreeMap<>();
            for (int i=0; i<sticks.length; i++){
                if (stickPair.containsKey(sticks[i])){
                    int val = stickPair.get(sticks[i]);
                    stickPair.put(sticks[i], val+1);
                } else
                    stickPair.put(sticks[i], 1);
            }

            for (Map.Entry map : stickPair.entrySet()){
                int val = (int) map.getValue();
                int key = (int) map.getKey();
                if (val >= 4){
                    max1 = max1 > key ? max1 : key;
                    max2 = max2 > key ? max2 : key;
                }
               else if ( val >= 2 && val <=4 ){
                    if (key > max1){
                        temp = max1;
                        max1 = key;
                    }
                    if (max1 > max2){
                        max1 = temp > max2 ? temp : max2;
                        max2 = key;
                    }
                }
            }
            if ((max1 == 0) || (max2 == 0)){
                System.out.println(0);
            }
            area = max1 * max2;
        }
        return area;
    }
}
