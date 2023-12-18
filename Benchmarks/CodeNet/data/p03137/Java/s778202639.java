import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        for(int i = 0; i < m; i++) {
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        if(n == 1) {
            System.out.println(x[m-1] - x[0]);
            return;
        }
        if(n >= m) {
            System.out.println(0);
            return;
        }
        
        int[] dists = new int[m-1];
        for(int i = 0; i < m - 1; i++) {
            dists[i] = x[i+1] - x[i];
        }
        
        List<Integer> used = new ArrayList<>();
        Set<Integer> divPoint = new HashSet<>();
        for(int i = 0; i < n - 1; i++) {
            int max = 0;
            int maxIndex = 0;
            for(int j = 0; j < m - 1; j++) {
                if(max < dists[j] && !used.contains(j)) {
                    max = dists[j];
                    maxIndex = j;
                }
            }
            used.add(maxIndex);
            divPoint.add(maxIndex);
        }
        
        int result = 0;
        int left = 0;
        int right = 0;
        for(Iterator iter = divPoint.iterator(); iter.hasNext(); ) {
            right = (int)iter.next();
            result += x[right] - x[left];
            left = right + 1;
        }
        result += x[m-1] - x[left];
        
        System.out.println(result);
        
            
    }           
}