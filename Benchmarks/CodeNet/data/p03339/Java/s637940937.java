import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
String S=sc.next();
int[] W=new int[N+1];
int[] sumW=new int[N+1];
int[] E=new int[N+1];
int[] sumE=new int[N+1];
int Min=N-1;
for(int i=1;i<=N;i++){
    if(S.charAt(i-1)=='W'){W[i]=1;E[i]=0;}
    if(S.charAt(i-1)=='E'){W[i]=0;E[i]=1;}
    sumW[i]+=sumW[i-1]+W[i];
    sumE[i]+=sumE[i-1]+E[i];
}
for(int i=1;i<=N;i++){
        Min=Math.min(sumW[i-1]+sumE[N]-sumE[i],Min );
}
System.out.println(Min);
}
}