import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Set numSet = new HashSet();
        int[] a_i = new int[N];
        
        for(int i = 0; i < N; i++) {
            int a = scan.nextInt();
            a_i[i] = a;
            numSet.add(a);
        }
        
        int maxX = 0;
        int maxXValue = 0;

        for(Object s : numSet) {
            int max = 0;
            for(int i = 0; i < N; i++) {
                if(a_i[i] - 1 <= (int)s && a_i[i] + 1 >= (int)s) {
                    max++;
                }
            }
            if(maxXValue < max) {
                maxX = (int)s;
                maxXValue = max;
            }
        }
        
        System.out.println(maxXValue);
    }
}
