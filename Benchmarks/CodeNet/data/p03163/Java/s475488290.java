import java.util.*;
import java.io.*;

class HelloWorld{




   public static long func(int weight[], long value[], int total, int weightnow, int index, int n, long dp[][] )
   { 
       
       if(index>=n)
       {
           return 0;
       }
       
       if(dp[index][weightnow]!=0)
       {
           return dp[index][weightnow];
       }
       long sum=0l;
     //  int sum1=0;
    long ans =0l;
       for(int i =index ; i<n;i++)
       {
           if(weightnow+weight[i]>total)
           {  //System.out.println("weight"+weightnow+" "+weight[i]);
              // sum1+=func(weight,value,total,weightnow,i+1,n);
              continue;
           }
           else{
               sum=value[i]+func(weight,value,total,weightnow+weight[i],i+1,n,dp);
               ans=Math.max(ans,sum);
           }
           
       }
       dp[index][weightnow]=ans;
       return ans ;
   }
   
     public static void main(String []args) throws Exception{
        //System.out.println("Hello World");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s =br.readLine();
       String ss[]=s.split(" ");
       int total=Integer.parseInt(ss[1]);
       int n =Integer.parseInt(ss[0]);
       int weight[]=new int[n];
       long value[]=new long[n];
       String temp;
       String tempo[];
        for(int i=0;i<n;i++)
        {
         temp=br.readLine();
         tempo=temp.split(" ");
         weight[i]=Integer.parseInt(tempo[0]);
         value[i]=Long.parseLong(tempo[1]);
        }
        
        
        
    long  sum=0l;
        
     int weightnow=0;
        
      long dp[][]=new long[n][total+1];
        long ans =0l;
        //Arrays.fill(dp,-1);
        for(int i=0;i<n;i++)
        {   
            if(weight[i]>total)
           {
            continue;
           }
            long val=value[i]+func(weight,value,total,weightnow+weight[i],i+1,n,dp);
           // System.out.println(val);
            ans =Math.max(ans , val);    
            
        }
        
        System.out.println(ans);
        
        
        
        
     }
}