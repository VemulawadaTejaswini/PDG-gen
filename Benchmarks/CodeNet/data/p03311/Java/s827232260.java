import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int ave1 = 0;
        int ave2 = 0;
        int ans1 = 0;
        int ans2 = 0;

        for(int i = 1;i <= n;i++){//i=0,1,2,,,,n-1 で動作
            array[i-1] = sc.nextInt() - i;
            ave1 += array[i-1];


        }

        ave2 = (int) Math.ceil((double)ave1 / array.length);
        ave1 = (int) Math.floor((double)ave1 / array.length);

        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans1 += Math.abs(array[i] - ave1);
        }
        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans2 += Math.abs(array[i] - ave2);
        }
        if(ans1>ans2)
        System.out.println(ans2);
        else
        System.out.println(ans1);
    }
}