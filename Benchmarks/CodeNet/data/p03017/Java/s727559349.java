import java.util.*;

public class Main {
    static int n;
    static char[] array;
    static int goalA;
    static int goalB;
    static boolean clear = false;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int startA = sc.nextInt();
        int startB = sc.nextInt();
        goalA = sc.nextInt();
        goalB = sc.nextInt();
        String str = sc.next();
        array = new char[n + 1];
        for (int i = 0; i < n; i++) {
            array[i + 1] = str.charAt(i);
        }
        
        dfs(startA, startB);
        
        if (clear) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static void dfs(int a, int b) {
        // System.out.println(a + " " + b);
        if (clear) return;
        if (a > n || b > n) return;
        if (array[a] == '#' || array[b] == '#') return;
        if (a == b) return;
        
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
