import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int a = sc.nextInt();
  int b = sc.nextInt();
  int ans = 0;
  for(int i =1;i<=n;i++){
    int c = (i/10000) + (i%10000)/1000 + (i%1000)/100 + (i%100)/10 +i%10;
    if(c>=a && c<=b)ans += i;
    if(i == n)System.out.println(ans);
  }
}}
