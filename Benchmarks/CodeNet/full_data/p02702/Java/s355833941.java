import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Solution {

    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int store = 0;
        int d = 2019;
        int mpot = 1;
        int arr[] = new int[2019];

        for(int i=len-1;i>=0;i--)
        {
            int n=s.charAt(i)-'0';
            int l = (len-1)-i;
            store = (store+(mpot*n))%d;
            mpot = (mpot*10) %d;
            arr[store]=arr[store]+1;
        }
        int ans =0;
        for(int i=0;i<2019;i++)
        {
            if(arr[i%2019]>1)
            {
                int al = arr[i%2019];
                //System.out.println(i+1);
                ans = ans + al*(al-1)/2;}

        }
        ans = ans+arr[0];

        System.out.println((ans));
    }
}