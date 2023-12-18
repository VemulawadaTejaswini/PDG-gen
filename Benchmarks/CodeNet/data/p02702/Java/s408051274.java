import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    int M[] =new int[93];
    String N[] =new String[93];
    String O[] =new String[93];
    String P[] =new String[93];
    long ans =0;
    for(int i=0;i<93;i++){
      M[i]=2019*(i+6);
      N[i]=String.valueOf(M[i]);}
    for(int j=0;j<=S.length()-5;j++){
      O[j]=S.substring(j,j+5);
      for(int k=0;k<43;k++){
        if(O[j].equals(N[k])){ans =ans+1;}}}
    for(int l=0;l<=S.length()-6;l++){
      P[l]=S.substring(l,l+6);
      for(int m=43;m<93;m++){
        if(P[l].equals(N[m])){ans =ans+1;}}}
    System.out.println(ans);
  }
}