import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, List<Integer>> hmap = new HashMap<>();
        for (Integer i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 1 || a == n) {
            List<Integer> listA = hmap.get(a);
            if (listA == null) {
                listA = new ArrayList<>();
            }
            listA.add(b);
            hmap.put(a, listA);
            }
            
            if (b == 1 || b == n) {
            List<Integer> listB = hmap.get(b);
            if (listB == null) {
                listB = new ArrayList<>();
           }
            listB.add(a);
            hmap.put(b, listB);
            }
        }

        List<Integer> list1 = hmap.get(1);
        List<Integer> listn = hmap.get(n);
        
        for (Integer med : list1) {
            if (listn.contains(med)) {
                System.out.println("POSSIBLE");
                return;
            }
        }
        System.out.println("IMPOSSIBLE");
    }
}
