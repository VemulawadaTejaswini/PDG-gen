import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int ans;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
    static int[] k_list;

    public static void main(String[] args) {
        var scaner = new Scanner(System.in);
        var n_k = scaner.nextLine().split(" ");
        var n = Integer.parseInt(n_k[0]); // sunuke
        var k = Integer.parseInt(n_k[1]); // syurui
        var d1 = Integer.parseInt(scaner.nextLine());

        k_list = new int[k];
        for(int i = 0; i< k; i++) { k_list[i] = i+1; }
        
        for (int i = 1; i <= k; i++) {
            var ai = new ArrayList<Integer>();
            for(String s: scaner.nextLine().split(" ")) {
                ai.add(Integer.parseInt(s));
            }
            a.add(ai);
        }

        for (int i = 0; i <= a.size(); i++) {
            ArrayList<Integer> child = a.get(i);
            int finalI = i;
            if (child.stream().anyMatch(t -> t == k_list[finalI])) {
                ans++;
            }
        }

        System.out.println(ans);
    }


}
