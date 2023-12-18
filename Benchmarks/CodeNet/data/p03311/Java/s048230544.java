import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        int ave = 0;
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;
        int ans4 = 0;
        int ans5 = 0;

        for(int i = 1;i <= n;i++){//i=0,1,2,,,,n-1 で動作
            array[i-1] = sc.nextInt() - i;
            ave += array[i-1];


        }

        ave = (int) Math.ceil((double)ave / array.length);


        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans1 += Math.abs(array[i] - ave-2);
        }
        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans2 += Math.abs(array[i] - ave-1);
        }
        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans3 += Math.abs(array[i] - ave);
        }
        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans4 += Math.abs(array[i] - ave+1);
        }
        for(int i = 0;i < n;i++){//i=0,1,2,,,,n-1 で動作
            ans5 += Math.abs(array[i] - ave+2);
        }


        System.out.println(Math.min(ans1,Math.min(ans2,Math.min(ans3,Math.min(ans4,ans5)))));
    }
}