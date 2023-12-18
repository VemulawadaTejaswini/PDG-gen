import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long result = 0;
        int N = sc.nextInt();
        int D = sc.nextInt();
        int A = sc.nextInt();
        int[] distance = new int[N];
        HashMap<Integer, Integer> atk = new HashMap<>();
        for (int i = 0; i < N; i++) {
            distance[i] = sc.nextInt();
            atk.put(distance[i], sc.nextInt());
        }
        Arrays.sort(distance);
        for (int j = 0; j < distance.length; j++) {
            int leftRestAtk = atk.get(distance[j]);
            int count = (leftRestAtk % A == 0) ? (leftRestAtk / A ) : (leftRestAtk / A ) + 1;
            for (int i = j;  i < distance.length ; i++) {
                if(distance[i] <= distance[j] + 2*D){
                    int atkP = atk.get(distance[i]);
                    int rest = atkP - count * A;
                    if(rest <= 0){
                        atk.put(distance[i], 0);
                    } else {
                        atk.put(distance[i], atkP - count * A);
                    }
                } else {
                    break;
                }
            }
            result += count;
        }
        System.out.println(result);
    }
}