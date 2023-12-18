import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt() * (-1);
            int index = upperBound(list, value);
            if (list.size() == index) {
                list.add(value);
            } else {
                list.set(index, value);
            }
        }
        
        System.out.println(list.size());
    }
    
    public static int upperBound(List<Integer> list, int target) {
        // 初めてのtarget超過のindexを返す
        // {1, 3, 3, 7} target: 3 -> 3
        
        int left = 0;
        int right = list.size();
        
        while (left < right) {
            int center = (left + right) / 2;
            if (list.get(center) <= target) {
                left = center + 1;
            } else {
                right = center;
            }
        }
        
        return left;
    }
}