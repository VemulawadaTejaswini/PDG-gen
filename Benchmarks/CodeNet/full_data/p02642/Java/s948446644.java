import java.util.Scanner;
import java.awt.image.BandedSampleModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int arr[] = new int[n];
        //Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(i>0&&arr[i-1]==arr[i])
            {
                continue;
            }
            if(i<n-1&&arr[i]==arr[i+1])
            {
                continue;
            }

            ans++;
            for(int j=0;j<i;j++)
            {
                if(arr[i]%arr[j]==0)
                {
                    ans--;
                    break;
                }
            }
        }
        System.out.println(ans);

    }
}
