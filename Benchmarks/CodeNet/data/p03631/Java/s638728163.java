import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long[] t = new long[N];
  for(int i = 0;i < N;i++){
    t[i] = sc.nextLong();
  }
  Arrays.sort(t);
  long ans = t[N-1];
  for(int i = 0;i < N;i++){
    if(ans%t[N-1-i] != 0){
      int a = 2;
      for(int j = 2;;j++){
        if(ans%j == 0 && t[N-1-i]%j == 0){
          a = j;
          break;
      }
      ans *= a;
    }
  }
  System.out.println(ans);
}}
