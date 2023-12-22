import java.util.*;
public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max_profit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i)
        {
            int data = sc.nextInt();
            int profit = data - min;
            if (profit > max_profit)
            {
                max_profit = profit;
            }
            if (data < min)
            {
                min = data;
            }
        }
        System.out.println(max_profit);
    }
}