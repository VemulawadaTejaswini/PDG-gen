import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    HashMap<Integer,Integer>hm=new HashMap();
    
    for(int i=0;i<n;i++){
    	arr[i]=sc.nextInt();
        if(hm.containsKey(arr[i])==false){
          hm.put(arr[i],1);
        }
        else{
          hm.put(arr[i], hm.get(arr[i])+1);
        }
    }
        //System.out.println(hm);
    int total=0;
    HashMap<Integer,Integer>hm2 = new HashMap();
    for(int i=0;i<n;i++){
      if(hm2.containsKey(arr[i])==false){
       	 int val = hm.get(arr[i]);
        val = (val*(val-1))/2;
        total+=val;
        hm2.put(arr[i],val);
      }
      
    }
    //System.out.println(hm2);
    for(int i=0;i<n;i++){
       int c = hm.get(arr[i]);
       c=c-1;
       c = (c*(c-1))/2;
       int v = hm2.get(arr[i]);
       System.out.println((total-v)+c);
      
      
    }
    
      
    
    
  }
  
}