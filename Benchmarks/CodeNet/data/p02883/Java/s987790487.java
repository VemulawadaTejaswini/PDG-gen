import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine();
            ArrayList<Integer> contestants = new ArrayList<>(n);
            ArrayList<Integer> foods = new ArrayList<>(n);
            for (int i = 0; i < n; i++){
                contestants.add(in.nextInt());
            }
            for (int i = 0; i < n; i++){
                foods.add(in.nextInt());
            }
            Collections.sort(contestants);
            Collections.sort(foods);
            while (k-- > 0) {
                ArrayList<Integer> times = new ArrayList<>(contestants.size());
                for (int i = 0; i < contestants.size(); i++) {
                    times.add(contestants.get(i) * foods.get(foods.size() - 1 - i));
                }
                reduceMax(times, contestants);
            }
            ArrayList<Integer> times = new ArrayList<>(contestants.size());
            for (int i = 0; i < contestants.size(); i++) {
                times.add(contestants.get(i) * foods.get(foods.size() - 1 - i));
            }
            System.out.println(Collections.max(times));
        }
    }

    private static void reduceMax(ArrayList<Integer> times, ArrayList<Integer> contestants){
        int i = 0;
        int max = times.get(0);
        for (int j = 1; j < times.size(); j++){
            if (times.get(j) > max){
                i = j;
                max = times.get(j);
            }
        }
        if (max == 0) return;
        contestants.set(i,contestants.get(i)-1);
        Collections.sort(contestants);
    }
}