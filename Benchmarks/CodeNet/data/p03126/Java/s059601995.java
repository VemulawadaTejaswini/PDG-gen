import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int[] f = new int[m+1];
  for(int i = 0;i < n;i++){
    int k = sc.nextInt();
    for(int j = 0;j < k;j++){
      int p = sc.nextInt();
      f[p]++;
    }
  }
  int ans = 0;
  for(int i = 0;i < m+1;i++){
    if(f[i] == n)ans++;
  }
  System.out.println(ans);
}}