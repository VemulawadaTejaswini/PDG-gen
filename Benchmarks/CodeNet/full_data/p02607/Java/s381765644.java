
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int count=0, n = in.nextInt();
        int[] ans = new int[n];

        for (int i = 1; i <=n; ++i) {
            ans[i-1] = in.nextInt();
            if (ans[i-1] %2 ==1 && i %2 ==1){
                count++;
            }
        }
        System.out.println(count);
    }}