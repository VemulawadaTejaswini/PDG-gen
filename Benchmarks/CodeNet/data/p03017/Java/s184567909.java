import java.util.*;

public class Main {
    static int n;
    static char[] array;
    static int goalA;
    static int goalB;
    static boolean clear = false;
    static boolean[][] visited;
    static int count = 0;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int startA = sc.nextInt();
        int startB = sc.nextInt();
        goalA = sc.nextInt();
        goalB = sc.nextInt();
        String str = sc.next();
        array = new char[n + 3];
        Arrays.fill(array, '#');
        for (int i = 0; i < n; i++) {
            array[i + 1] = str.charAt(i);
        }
        
        visited = new boolean[n + 3][n + 3];
        
        dfs(startA, startB);
        
        if (clear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // System.out.println(count);
    }
    
    public static void dfs(int a, int b) {
        if (visited[a][b]) return;
        visited[a][b] = true;
        // System.out.println(a + " " + b);
        if (clear) return;
        if (a > n || b > n) return;
        if (array[a] == '#' || array[b] == '#') return;
        if (a == b) return;
        
        count++;
        
        if (a == goalA && b == goalB) {
            clear = true;
            return;
        }
        
        dfs(a + 1, b);
        dfs(a + 2, b);
        dfs(a, b + 1);
        dfs(a, b + 2);
    }
}
