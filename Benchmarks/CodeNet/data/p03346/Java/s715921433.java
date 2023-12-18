import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
int[] ar = new int[N];
int[] index = new int[N+1];
int answer=N;
for(int i=0;i<N;i++){
  ar[i] = sc.nextInt();
}
outer:for(int i=1;i<=N;i++){
  for(int j=0;j<N;j++){
    if(ar[j] == i){
      index[i]=j;
      if(i>1){
        if(index[i]<index[i-1]&&answer>N-(i-1)){
          answer=N-(i-1);
          break outer;
        }
      }
    }
  }
}
outer:for(int i=N;i>=1;i--){
  for(int j=0;j<N;j++){
    if(ar[j] == i){
      index[i]=j;
      if(i<N){
        if(index[i]>index[i+1]&&answer>i){
          answer=i;
          break outer;
        }
      }
    }
  }
}
      System.out.println(answer);
      }
}
