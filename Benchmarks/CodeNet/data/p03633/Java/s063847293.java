import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long[] t = new long[N];
  for(int i = 0;i < n;i++){
    t[i] = sc.nextLong();
  }
  Arrays.sort(t);
  long max = t[N-1];
  for(long i = max;;i += max){
    boolean ok = true;
    for(int j = 0;j < N;j++){
      if(i%t[j] != 0){
        ok = false;
        break;
      }
    }
    if(ok){
      System.out.println(i);
      break;
    }
  }
}}