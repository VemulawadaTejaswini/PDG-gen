import java.io.*;
class Main
{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			        
  int h,n;
  int a[]=new int[1000];
  String[] strs=br.readLine().trim().split("\\s+");
  String[] strsa=br.readLine().trim().split("\\s+");
  h=Integer.parseInt(strs[0]);
  n=Integer.parseInt(strs[1]);
  int i=0,s=0;
  for(i=0;i<strsa.length;i++)                 
{                                              
a[i]=Integer.parseInt(strsa[i]);                
}
  int s=0;
  for (i=0;i<strsa.length;i++)                 
{           
   s=s+a[i]; 
  }
  if(h-s==0)
    System.out.println("Yes");
  else
    System.out.println("No");
}
}