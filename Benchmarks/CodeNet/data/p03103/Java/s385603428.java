import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            
            boolean isAdd = false;
            for (int j = 0; j < i; j++) {
                if (a[list.get(j)] > a[i]) {
                    list.add(j, i);
                    isAdd = true;
                }
            }
            if (!(isAdd))
                list.add(i);
        }
        
        long totalPrice = 0;
        int totalCnt = 0;
        for (int i = 0; i < n; i++) {
            int index = list.get(i);
            long price = a[index];
            int count = b[index];
            
            if (count >= m - totalCnt) {
                totalPrice += (m - totalCnt) * price;
                break;
            } else {
                totalPrice += count * price;
                totalCnt += count;
            }
        }
        
        System.out.println(totalPrice);
    }
}
