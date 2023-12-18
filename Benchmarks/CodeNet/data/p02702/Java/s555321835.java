import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    int x =S.length();
    String O;
    int P;
    long ans =0;
    for(int i=0;i<x-4;i++){
      for(int j=i+5;j<=x;j++){
        O = S.substring(i,j);
        P = Integer.parseInt(O);
        if(P%2019==0){ans =ans+1;}}}
    System.out.println(ans);
  }
}