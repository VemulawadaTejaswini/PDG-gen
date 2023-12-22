

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;



 class Main{
     
    static int count=0;
    
     public static void main(String args[]){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         try{
             String line;
             while((line=br.readLine())!=null){if(line.isEmpty())break;
                 count=0;
                 String[] split = line.split(" ");
                 int n=Integer.parseInt(split[0]);int s=Integer.parseInt(split[1]);
                 if(n==0&&s==0)break;
                 func(n,s,0,0,-1);
                 System.out.println(count);
             }
         }catch(Exception e){}
         
     }
     
     static void func(int n, int s, int sum,int nowN,int prev){
         if(nowN==n){if(sum==s)count++;return;}
         if(sum>s)return;
         for(int i=prev+1;i<=100-(n-nowN)+1;i++ ){
             if(i>s)break;
             func(n,s,sum+i,nowN+1,i);
         }
     }
 }