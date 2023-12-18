import java.util.*;
public class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n[]=new int[a+1];
int m[]=new int[a+1];
for(int i=0;i<a;i++)
  n[i+1]=sc.nextInt()+n[i];
  for(int i=0;i<a;i++)
  m[i+1]=sc.nextInt()+m[i];

  int ans=0;
for(int i=0;i<a;i++){
ans=Math.max(ans,n[i+1]+m[a]-m[i]);}
System.out.println(ans);
}
}