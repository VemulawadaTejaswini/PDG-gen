import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    int x =S.length();
    long M[] =new long[500];
    String N[] =new String[500];
    String O[] =new String[x];
    String P[] =new String[x];
    long ans =0;
    for(int i=0;i<=93;i++){
      M[i]=2019*(i+6);
      N[i]=String.valueOf(M[i]);}
    for(int j=0;j<=x-5;j++){
      O[j]=S.substring(j,j+5);
      for(int k=0;k<=43;k++){
        if(O[j].equals(N[k])){ans =ans+1;}}}
    for(int l=0;l<=x-6;l++){
      P[l]=S.substring(l,l+6);
      for(int m=44;m<=495;m++){
        if(P[l].equals(N[m])){ans =ans+1;}}}
    System.out.println(ans);
  }
}