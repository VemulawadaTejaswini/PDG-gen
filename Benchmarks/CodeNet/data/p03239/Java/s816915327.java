import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int t = sc.nextInt();
  int min = 10000;
  int cost = 10000;
  for(int i = 0;i < n;i++){
    int c = sc.nextInt();
    int s = sc.nextInt();
    if(s <= t){
      min = Math.min(min,s);
      cost = Math.min(cost,c);
    }
  }
  System.out.println(min == 10000 ? "TLE":cost);
}}
