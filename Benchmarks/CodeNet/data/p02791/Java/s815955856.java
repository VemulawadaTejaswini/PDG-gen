import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] = new int [N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();}
    int v =0;
    for(int w=0;w<N;w++){
      if(M[w]==1){v=v+w;}
      else{v=v;}}
    int x=0;
    int L=M[0];
    for(int j=0;j<v;j++){
      for(int k=1;k<=j;k++){
         L= Math.min(L,M[k]);}
      if(L==M[j]){
        x=x+1;}
      else{
        x = x;};}
    System.out.println(x+1);
  }
}
