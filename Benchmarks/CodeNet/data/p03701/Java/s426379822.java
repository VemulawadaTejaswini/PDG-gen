//package hackerarth;


import java.util.ArrayList;
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
        int mSum =-1;
        Collections.sort(arr);
        if(sum%10!=0)
            System.out.println(sum);
        else{
            for(int i=0;i<arr.size();i++)
            {
                if((arr.get(i))%10!=0)
                    mSum+=arr.get(i);
                    
            }
            if(mSum==-1)
                System.out.println(mSum);
            else
                System.out.println(sum-mSum);
        }

    }
}