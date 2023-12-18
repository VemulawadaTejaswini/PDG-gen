import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] h = new int[n+2];
  h[0] = 0;
  h[n+1] = 0;
  for(int i = 0;i < n;i++){
    h[i+1] = sc.nextInt();
  }
  int cnt = 0;
  for(;;){
    int a = 200;
    int b = 200;
    for(int i = 0;i < n+2;i++){
      if(h[i] != 0){
        a = i;
        break;
      }
    }
    if(a == 200)break;
    for(int i = a;i < n+2;i++){
      if(h[i] == 0){
        b = i;
        break;
      }
    }
    for(int i = a;i < b;i++){
      h[i]--;
    }
    cnt++;
  }
  System.out.println(cnt);
}}