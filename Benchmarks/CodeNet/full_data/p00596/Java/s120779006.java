import java.util.*;

public class Main {
    public static int N;
    public static int[] arr;
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextInt()) {
            N = in.nextInt();
            
            arr = new int[N];
            boolean[] visited = new boolean[N];
            
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            
            boolean found = false;
            for (int i = 0; i < N && !found; i++) {
                visited[i] = true;
                found = found || recursive(0, arr[i] % 10, visited, 1)
                    || recursive(0, arr[i] / 10, visited, 1);
                visited[i] = false;
            }
            
            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    
    public static boolean recursive(int pos, int n, boolean[] visited, int len) {
        if (len == N) return true;
        if (pos == N) return false;
        
        boolean ret = false;
        int a = arr[pos] % 10;
        int b = arr[pos] / 10;
        int newNum = a == n ? b : a;
        
        if (visited[pos]) return recursive(pos+1, n, visited, len);
        if (a != n && b != n) return recursive(pos+1, n, visited, len);
        
        visited[pos] = true;
        ret = ret || recursive(0, newNum, visited, len+1);
        visited[pos] = false;
        ret = ret || recursive(pos+1, n, visited, len);
        
        return ret;
    }
}

