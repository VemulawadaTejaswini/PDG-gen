import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M[] = new int [N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();}
    int answer=0;
    int L=M[0];
    for(int j=0;j<N;j++){
      for(int k=0;k<=j;k++){
         L= Math.min(L,M[k]);}
      if(L==M[j]){
        answer = answer+1;}
      else{
        answer = answer;};}
    System.out.println(answer);
  }
}