import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;


import java.util.HashSet;
import java.util.Collections;


public class Main{
    static Scanner sc=new Scanner(System.in);
    static int N=sc.nextInt();
    static int[]a=new int[12];
    static int min=100;
    
    public static void main(String[] args){
        a[0]=1;
        a[1]=6;
        a[2]=9;
        a[3]=36;
        a[4]=81;
        a[5]=216;
        a[6]=729;
        a[7]=1296;
        a[8]=6561;
        a[9]=7776;
        a[10]=46656;
        a[11]=59049;
        int x=0;
        int sum=N;
        for(int j=0;j<12;j++){
            if(sum<a[j]){
                x=j-1;
                break;

            }
        }
        tansaku(N,0,x);
        System.out.println(min);
        

            

        
        
        
        
            

        
        

    }
    static void tansaku(int sum,int kaisuu,int x){
        if(sum==0){
            if(kaisuu<min){
                min=kaisuu;
            }
            return;
        }
        for(int j=0;j<x+1;j++){
            if(sum<a[j]){
                x=j-1;
                break;

            }
            if(j==x){
                break;
            }
        }
        tansaku(sum-a[x],kaisuu+1,x);
        if(x-1>=0){
        tansaku(sum-a[x-1],kaisuu+1,x);}
        if(x==10){
            tansaku(sum-a[x-2],kaisuu+1,x);
        }
        
        
    
    
        
        
    }}
