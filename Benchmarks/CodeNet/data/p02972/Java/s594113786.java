import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for (int i = n; i >= 1; i--) {
            int num = i;
            int sum = 0;
            while (num <= n) {
                sum += array[num - 1];
                num += i;
            }
            
            if (sum % 2 == 1) {
                list.add(i);
            }
        }
        
        System.out.println(list.size());
        for (Integer l : list) {
            System.out.print(l);
            System.out.print(" ");
        }
    }
}
