import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main
{
    static long MOD = 109 + 7;

    public void run()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList();
        if (n == 3)
        {
            nums.addAll(Arrays.asList(2, 5, 63));
        } else if (n == 4)
        {
            nums.addAll(Arrays.asList(2, 5, 20, 63));
        } else if (n == 5)
        {
            nums.addAll(Arrays.asList(2, 5, 20, 30, 63));
        } else
        {
            for (int i = 0; i < n / 4; i++)
            {
                nums.add(6 * i + 2);
                nums.add(6 * i + 3);
                nums.add(6 * i + 4);
                nums.add(6 * i + 6);
            }
            int i = n / 4;
            if (n % 4 >= 1)
            {
                nums.add(6 * i + 2);
            }
            if (n % 4 >= 2)
            {
                nums.add(6 * i + 3);
            }
            if (n % 4 >= 3)
            {
                nums.add(6 * i + 4);
            }

            int sum = nums.stream().mapToInt(Integer::intValue).sum();
            System.err.println(sum);
            if (sum % 6 == 2)
            {
                nums.remove(Integer.valueOf(8));
                nums.add(6 * (i + 1));
            } else if (sum % 6 == 3)
            {
                nums.remove(Integer.valueOf(9));
                nums.add(6 * (i + 1));
            } else if(sum % 6 == 5)
            {
                nums.remove(Integer.valueOf(9));
                nums.add(6 * (i + 1) + 4);
            }
            System.err.println(nums.stream().mapToInt(Integer::intValue).sum());
        }
        
        System.out.println(String.join(" ", nums.stream().map(i -> i + "").collect(Collectors.toList())));
    }

    static public void main(String[] args)
    {
        new Main().run();
    }
}