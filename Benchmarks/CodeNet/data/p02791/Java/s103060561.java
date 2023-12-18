import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
      int M[] = new int [N];
    int s =0;
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();
     s = s+1;
    if(M[i]==1){break;}}
    int x=0;
    for(int j=0;j<s;j++){
      int L =M[j];
      int R =M[j];
      int Y=(j-j%2)/2;
      for(int k=0;k<=Y;k++){
         L= Math.min(L,M[Y-k]);
         if(L==M[Y-k]){break;}
      else{for(k=0;k<=Y;k++){
             R= Math.min(R,M[j-k]);
                    if(R==M[j-k]){break;}}
    if(R==M[j]){x=x+1;}else{x=x;}}}
    System.out.println(x+1);}
}