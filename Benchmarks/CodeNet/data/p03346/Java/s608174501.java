import java.util.*;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
long[] ar = new long[N];
long[] index = new long[N+1];
long answer=N;
for(int i=0;i<N;i++){
  ar[i] = sc.nextInt();
}
outer:for(long i=1;i<=N;i++){
inner:  for(long j=N-1;j>=0;j--){
      if(i>1&&j==index[i-1]) {
        if(answer>N-(i-1)){
            answer=N-(i-1);
        }
              break outer;
      }
    if(ar[j] == i){
      index[i]=j;
            break inner;
    }
    }
}

outer:for(long i=N;i>=1;i--){
inner:  for(long j=0;j<N;j++){
      if(i<N&&j==index[i+1]) {
        if(answer>i){
            answer=i;
        }
              break outer;
      }
    if(ar[j] == i){
      index[i]=j;
            break inner;
    }
    }
}

      System.out.println(answer);
      }
}
