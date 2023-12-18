import java.io.*;
import java.util.*;

/*
 * // 
Given an array A[] , calculate the sum of minimum of all subarrays of A.
 * e.g, A[] = {1, 2, 3} , ans = sum( min({1}), min({2}), min({3}), min({1, 2}), min({2, 3}), min({1, 2, 3}) ) = 10
 
 
 2 5 8 9= 2*4+5*3+8*2+9*1
 
 6 4 1 7 8
 6 1 1=1*1
 4 1 2=2*1
 1 1 5=3*3
 7 4 5=1*2
 8 5 5=1*1
 */

class Solution {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
      int arr[]=new int[n+2];
      int leftSmall[]=new int[n+2];
      int rightSmall[]=new int[n+2;
      for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
      int leftIdx=0;
      Stack<Integer> stk=new Stack<>();
      for(int i=0;i<n;i++){
          while(!stk.isEmpty() && arr[i]<arr[stk.peek()]){
              stk.pop();
          }
        
        if(stk.isEmpty())
          leftSmall[i]=-1;
        else{
          leftSmall[i]=stk.peek();
      }
        stk.push(i);
  }
    
    stk.clear();
    for(int i=n-1;i>=0;i--){
       while(!stk.isEmpty() && arr[i]<arr[stk.peek()]){
              stk.pop();
          }
        
        if(stk.isEmpty())
          rightSmall[i]=n;
        else{
          rightSmall[i]=stk.peek();
      }
        stk.push(i);
    }
    
    long ans=0;
    for(int i=0;i<n;i++){
        long left=i-leftSmall[i];
        long right=rightSmall[i]-i;
        ans+=((left*right)*arr[i]);
    }
    
    System.out.println(ans);
}
}


