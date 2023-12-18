import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int ans = 0;
        if(((H * W)/2)%2==1)
        {
            ans = (H * W) / 2 + 1;
        }
        else
        {
            ans = (H * W) / 2;
        }
        System.out.println(ans);
    }
}
