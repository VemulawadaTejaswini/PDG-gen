import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] t = new int[N];
  int sum = 0;
  for(int i = 0;i < N;i++){
    t[i] = sc.nextInt();
    sum += t[i];
  }
  int M =sc.nextInt();
  int[] p = new int[2*M];
  for(int i = 0;i < 2*M;i += 2){
    p[i] = sc.nextInt();
    p[i+1] = sc.nextInt();
    System.out.println(sum - t[p[i]] + p[i+1]);
  }
}}