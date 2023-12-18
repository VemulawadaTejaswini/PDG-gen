import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0;i<n; i++) {
            a[i] = sc.nextInt();
            map.put(i, (double)(a[i] + 1) / 2);
        }
        double max = 0;
        double first = 0;
        for (int i = 0;i<k ;i++) {
          first += map.get(i);
        }
      
        int l = 0;
        double tmp = first;
        for (int i = k;i<n;i++) {
          tmp += map.get(i);
          tmp -= map.get(l++);
		  max = Math.max(tmp, max);
        }
        System.out.println(max);
    }
}