/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
    public class Main
    {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i = 0;i<n;i++)
      arr[i] = sc.nextInt();
      int[] ans = new int[n];
      ans[0] = 0;
      ans[1] = arr[1] - arr[0];
      if(n<=2)
        System.out.println(ans[n-1]);
      else
      {
      for(int i = 2;i<n;i++)
      {
      ans[i] = Integer.min(ans[i-1]+Math.abs(arr[i] - arr[i-1]),Math.abs(arr[i] - arr[i-2]) + ans[i-2]) ;
      System.out.println(ans[i]+" ");
      }
      System.out.println(ans[n-1]);
      }
    	}
    }
