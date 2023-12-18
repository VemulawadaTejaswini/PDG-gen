
import java.util.*;

public class Main
{
    private final static Main main = new Main();

    public static void main(String[] args)
    {
        main.contest();
    }

    private void contest()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for(int i=0; i<n; ++i)
        {
            list[i] = sc.nextInt()-1;
        }
        int count = 0;
        for(int i=0; i<n; ++i)
        {
            int target = list[i];
            if(i == list[target])
            {
                count++;
                list[i] = -1;
            }
        }
        System.out.println(count);
    }
}
