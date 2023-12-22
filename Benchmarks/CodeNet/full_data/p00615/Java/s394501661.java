import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 try{
     while(true){
  String str[]=br.readLine().split(" ");
  if(str[0].equals("0")&&str[1].equals("0"))break;
  
  int a[];
  a=new int[20001];
  
  int k=1,num=0;
  
  if(!str[0].equals("0")){
      
      String str1[]=br.readLine().split(" ");
      
      for(int i=0;i<str1.length;i++){
   num=0;
   for(int j=0;j<str1[i].length();j++)num=num*10+str1[i].charAt(j)-'0';
   a[k]=num;k++;
      }
      
  }
  
  if(!str[1].equals("0")){
      
      String str2[]=br.readLine().split(" ");
      
      for(int i=0;i<str2.length;i++){
   num=0;
   for(int j=0;j<str2[i].length();j++)num=num*10+str2[i].charAt(j)-'0';
   a[k]=num;k++;
      }

  }
  Arrays.sort(a,0,k);
  int max=0;
  for(int i=1;i<k;i++)
      if(a[i]-a[i-1]>max)max=a[i]-a[i-1];
  System.out.println(max);   
     }
 }
 catch(Exception e){return ;}
    }
}
