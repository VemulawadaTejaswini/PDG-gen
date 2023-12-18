//package hackerarth;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<q;i++)
        {
            int m = sc.nextInt();
            sum +=m;
            arr.add(m);
        }
        int mSum =0;
        Collections.sort(arr);
        if(sum %10!=0)
        {
           System.out.println(sum);
        }
        else
        {
            for(int i=0;i<arr.size();i++)
            {
                sum = sum - arr.get(i);
                if(sum%10==0)
                    sum+=arr.get(i);
                else
                {
                    System.out.println(sum);
                    break;
                }

            }
        }

    }
}