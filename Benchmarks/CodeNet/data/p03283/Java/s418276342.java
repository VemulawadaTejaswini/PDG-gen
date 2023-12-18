import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int q = sc.nextInt();
  int[] t = new int[2*m];
  int[] p = new int[2*q];
  for(int i = 0;i < m;i++){
    t[i] = sc.nextInt();
    t[i+1] = sc.nextInt();
  }
  for(int i = 0;i < q;i++){
    p[i] = sc.nextInt();
    p[i+1] = sc.nextInt();
  }
  for(int i = 0;i < q;i++){
    int count = 0;
    for(int j = 0;j < m;j++){
      if(p[i] <= t[j]){
        if(p[i+1] >= t[j+1]){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}}