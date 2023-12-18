import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] n = new int[4];
        for(int i = 0; i < 4; ++i) n[i] = sc.nextInt();
        Arrays.sort(n);
        int[] m = {1, 4, 7, 9};
        String ans = (Arrays.equals(n, m)) ? "YES" : "NO";
        System.out.println(ans);
    }
}