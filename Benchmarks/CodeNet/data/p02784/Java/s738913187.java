import java.io.*;
class Main
{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			        
  int h,n,i=0,s=0;
  int a[]=new int[1000];
  String[] strs=br.readLine().trim().split("\\s+");
  String[] strsa=br.readLine().trim().split("\\s+");
  h=Integer.parseInt(strs[0]);
  n=Integer.parseInt(strs[1]);
  for(i=0;i<strsa.length;i++)                 
{                                              
a[i]=Integer.parseInt(strsa[i]);
    s=s+a[i];
}
  if(s-h>=0)
    System.out.println("Yes");
  else
    System.out.println("No");
}
}