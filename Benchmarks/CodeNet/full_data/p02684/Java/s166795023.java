import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    long k=sc.nextLong();
    int arr[]=new int[t];
    int vis[]=new int[t];
    for(int i=0;i<t;i++){
      arr[i]=sc.nextInt()-1;
      vis[i]=0;
    }
    int count=0;
    int curr=0;
    int prev=0;
    int flag=-1;
    while(k!=0)
    {
      if(vis[curr]==0)
      {        
      vis[curr]=1;
      prev=curr;
      curr=arr[curr];
      k--;
      continue;}
      else
      {
        count++;
        k--;
        prev=curr;
        if(flag==-1)
          flag=curr;
        else if(curr==flag)
          break;       
        curr=arr[curr];
        continue;}
        
  }
    count--;
    int pos=-1;
    if(count>0)
    {
      if(k%count==0)
     	 pos=prev;
      else{
        k=k%count;
      	curr=flag;
      	while(k!=0)
        {
          curr=arr[curr];
          k--;
        }
        pos=curr;}
    }
    
    System.out.println(pos--);
}
}