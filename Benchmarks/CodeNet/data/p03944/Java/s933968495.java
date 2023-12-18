import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int W = sc.nextInt();
  int H = sc.nextInt();
  int N = sc.nextInt();
  int l = 0;int r = W;int u = H;int d = 0;
  int[] x = new int[3*N];
  for(int i = 0;i < 3*N;i += 3){
    x[i] = sc.nextInt();
    x[i+1] = sc.nextInt();
    x[i+2] = sc.nextInt();
    if(x[i+2] == 1){
      if(l <= x[i])l = x[i];
    } 
    else if(x[i+2] == 2){
      if(x[i] <= r)r = x[i];
    }
    else if(x[i+2] == 3){
      if(d <= x[i+1])d = x[i+1];
    }
    else{
      if(x[i+1] <= u)u = x[i+1];
    }
  }
  if(r-l >= 0 && u-d >= 0)System.out.println((r-l)*(u-d));
  else system.out.println("0");
}}
