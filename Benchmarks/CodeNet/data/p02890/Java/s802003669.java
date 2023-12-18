import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scn.nextInt());
        }
        int total = 0;
//        System.out.println(N);
        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> copy = new ArrayList<>(L);
            Set<Integer> set = new HashSet<>();
            total =0;
            for (int j = 0; j < copy.size(); j++) {
                if (!set.contains(copy.get(j))) {
                    set.add(copy.get(j));
//                    copy.remove(j);
                }
                if (set.size() == i){
                    total = total+1;
                    set = new HashSet<>();
                }
            }
            System.out.println(total);
        }
    }
}