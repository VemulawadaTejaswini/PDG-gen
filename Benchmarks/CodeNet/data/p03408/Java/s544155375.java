import java.util.*;
import java.lang.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int N=Integer.valueOf(sc.nextLine());
String[] blue=new String[N];
for(int i=0;i<N;i++){
blue[i]=sc.nextLine();
}
int M=Integer.valueOf(sc.nextLine());
String[] red=new String[N];
for(int i=0;i<M;i++){
red[i]=sc.nextLine();
}
int[] point=new int[N];
int ans=0;
for(int i=0;i<N;i++)
point[i]=0;
for(int i=0;i<N;i++)
 for(int j=1;j<N;j++)
  if(blue[i]==blue[j])point[i]++;
for(int i=0;i<N;i++)
  for(int j=0;j<M;j++)
    {if(blue[i]==red[j])point[i]--;
   ans=Math.max(ans,point[i]);}
System.out.println(ans);
}
}