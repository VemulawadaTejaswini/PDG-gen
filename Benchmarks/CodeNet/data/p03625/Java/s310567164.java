import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  long[] len = new long[1000000001];
  for(int i = 0;i < N;i++){
    long a = sc.nextLong();
    len[a]++;
  }
  long w = 0;
  long h = 0;
  int count = 0;
  out:
  for(long i = 1000000000;;i--){
    if(len[i] == 4 && count == 0){
      w = i;
      h = i;
      break;
    }
    else if(len[i] >= 2){
      if(count == 0){
        w == i;
        count++;
      }
      else if(count == 1){
        h == i;
        break out;
      }
    }
  }
  System.out.println(h*w);
}}
    