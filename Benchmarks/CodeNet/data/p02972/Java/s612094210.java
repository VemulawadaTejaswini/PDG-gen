import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n+1];
        
        for(int i=1; i<=n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        
        List<Integer> list = new ArrayList<>();
        int[] in = new int[n+1];
        int count = 0;
        for(int i=n; i>0; i--) {
            count = 0;
            int j=1;
            while(i*j <= n) {
                count += in[i*j];
                j++;
            }
            if(count % 2 != a[i]) {
                in[i]++;
                list.add(i);
            }
        }
        
        System.out.println(list.size());
        for(int x : list) {
            System.out.println(x+" ");
        }
    }
}
