import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int[] ans = new int[3];
        
        ans[0] = A + B;
        ans[1] = A - B;
        ans[2] = A * B;
        
        int max = -100000000;
        for(int i = 0; i < 3; i++){
            max = Math.max(max, ans[i]);
        }
        
        System.out.println(max);
    }
}
