import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int ans = 0;
  int tz = 0;
  int t1 = 0;
  int t2 = 0;
  long cmp = 0;
  for(int i = 0;i < n;i++){
    int a = sc.nextInt();
    if(a == 0){
      tz++;
      t1 = t2;
      t2 = 0;
    }
    else if(a%2 == 0){
      ans += tz;
      tz = 0;
      if(t1 == 2 && t2 == 1){
        ans++;
      }
      t1 = t2;
      t2 = 2;
    }
    else if(a%2 == 1){
      ans += tz;
      tz = 0;
      if(t1 == 1 && t2 == 2){
        ans++;
      }
      t1 = t2;
      t2 = 1;
    }
  }
  System.out.println(ans);
}}