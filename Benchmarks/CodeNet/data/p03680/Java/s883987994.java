import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] a = new int[N];
  for(int i = 0;i < N;i++)a[i] = sc.nextInt();
  int b = 0;
  int c = 0;
  for(int i = 0;;i++){
    if(a[b] == 2){
      System.out.println(i+1);
      break;
    }
    else if(a[b] == 1){
      System.out.println("-1");
      break;
    }
    c = a[b];
    else b = c-1;
  }
}}
