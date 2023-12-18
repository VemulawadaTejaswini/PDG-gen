import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] h = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            h[i] = scan.nextInt();
        }
        int[] ha = h;
        Arrays.sort(ha);
        for(int i = 1; i < n; i++){
            if(ha[i] == ha[i - 1]){
                a++;
            }
        }
        int[][] ab = new int[m][2];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < 2; j++){
                ab[i][j] = scan.nextInt();
            }
        }
        List<Integer> removed = new ArrayList<>();
        for(int i = 0; i < m; i++){
            if(h[ab[i][0] - 1] > h[ab[i][1] - 1]){
                removed.add(ab[i][1]);System.out.println(removed.get(i));
            }else if(h[ab[i][0] - 1] < h[ab[i][1] - 1]){
                removed.add(ab[i][0]);System.out.println(removed.get(i));
            }
        }
        List<Integer> check = new ArrayList<>(new HashSet<>(removed));
        System.out.println(check.size());
        System.out.println(h.length - check.size() / 2 - a);
    }
}