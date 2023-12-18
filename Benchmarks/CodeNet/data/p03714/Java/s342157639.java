import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (
            Scanner sc = new Scanner(System.in);
        ) {
            int n = sc.nextInt();
            LinkedList<Integer> nList = new LinkedList<>();
            for (int i = 0; i < n * 3; i++) {
                nList.add(sc.nextInt());
            }
            
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    exceptMin(nList);
                } else {
                    exceptMax(nList);
                }
            }

            int left = 0;
            for (int i = 0; i < n; i++) {
                left += nList.get(i);
            }
            
            int right = 0;
            for (int i = n; i < n * 2; i++) {
                right += nList.get(i);
            }
            
            int result = left - right;
            System.out.println(result);
        }
    }
    
    private static void exceptMin(LinkedList<Integer> list) {
        int targetI = 0;
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (min > list.get(i)) {
                targetI = i;
                min = list.get(i);
            }
        }
        list.remove(targetI);
    }
    
    private static void exceptMax(LinkedList<Integer> list) {
        int lastI = list.size() - 1;
        int targetI = lastI;
        int max = list.get(lastI);
        for (int i = lastI - 1; 0 <= i; i--) {
            if (max < list.get(i)) {
                targetI = i;
                max = list.get(i);
            }
        }
        list.remove(targetI);
    }

}
