import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
  int[] x = new int[N];
  int[] a = new int[N];
  for(int i = 0;i < N;i++){
    x[i] = sc.nextInt();
    a[i] = x[i];
  }
  Arrays.sort(a);
  int m1 = a[(N+1)/2];
  int m2 = a[(N-1)/2];
  double m = (m1+m2)/2;
  for(int i = 0;i < N;i++){
    System.out.println(x[i] <= m ? m1:m2);
  }
}}