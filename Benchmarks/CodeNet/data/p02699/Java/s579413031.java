import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S=sc.next();
    int x =S.length();
    String s[] =S.split("",0);
    int y[]=new int[x+1];
    long z[]=new long[x];
    long w[]=new long[2019];
    y[x]=0;
    long v[] =new long[x];
    long ans =0;
    for(int i=x-1;i>=0;i--){
      z[i]=Integer.parseInt(s[i]);
      v[i]=1;
      for(int j=0;j<x-1-i;j++){
        v[i]=(v[i]*10)%2019;}
      y[i]=(y[i+1]+z[i]*v[i])%2019;
      w[y[i]]=w[y[i]]+1;}
    for(int k=0;k<2019;k++){
      ans =ans+w[k]*(w[k]-1)/2;}
    System.out.println(ans);
  }
}
