import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int[] vec=new int[N];
char[] x=new char[N];
String S=sc.next();
int WL=0,ER=0,Min=N;
for(int s=0;s<N;s++){
x[s]=S.charAt(s);}
for(int i=0;i<N;i++){
WL=0;ER=0;
for(int t=0;t<i;t++){
if(x[t]=='W')WL+=1;
}
for(int r=(i+1);r<N;r++){
  if(x[r]=='E')ER+=1;
}
vec[i]=(WL+ER);
Min=Math.min(Min,vec[i]);
if(Min==0)break;
}
System.out.println(Min);
}
}