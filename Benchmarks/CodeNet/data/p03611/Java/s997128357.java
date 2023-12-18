import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[100010][2];
        for (int i = 0; i < 100010; i++) {
            array[i][0] = i;
        }
        
        while (n-- > 0) {
            int num = sc.nextInt();
            array[num][1]++;
            array[num - 1][1]++;
            array[num + 1][1]++;
        }
        
        Arrays.sort(array, (a, b) -> Integer.compare(a[1], b[1]));
        int x = array[100009][1];
        
        System.out.println(x);
    }
}
