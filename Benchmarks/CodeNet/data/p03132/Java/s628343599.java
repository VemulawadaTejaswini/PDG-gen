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
  int[] a = new int[n];
  for(int i = 0;i < n;i++){
    a[i] = sc.nextInt();
    if(a[i] == 0){
      tz++;
      t1 = t2;
      t2 = 0;
    }
    else if(a[i]%2 == 0){
      if(t2 == 0 && tz <= cmp){
      ans += tz;
      }
      else if(t2 == 0){
        ans += cmp;
      }
      tz = 0;
      cmp += a[i];
      if(t1 == 2 && t2 == 1){
        ans++;
      }
      t1 = t2;
      t2 = 2;
    }
    else if(a[i]%2 == 1){
      if(t2 == 0 && tz <= cmp){
      ans += tz;
      }
      else if(t2 == 0){
        ans += cmp;
      }
      tz = 0;
      cmp += a[i];
      if(t1 == 1 && t2 == 2){
        ans++;
      }
      t1 = t2;
      t2 = 1;
    }
  }
  
  int ans2 = 0;
  tz = 0;
  t1 = 0;
  t2 = 0;
  cmp = 0;
  for(int i = n-1;i >= 0;i--){
    if(a[i] == 0){
      tz++;
      t1 = t2;
      t2 = 0;
    }
    else if(a[i]%2 == 0){
      if(t2 == 0 && tz <= cmp){
      ans2 += tz;
      }
      else if(t2 == 0){
        ans2 += cmp;
      }
      tz = 0;
      cmp += a[i];
      if(t1 == 2 && t2 == 1){
        ans2++;
      }
      t1 = t2;
      t2 = 2;
    }
    else if(a[i]%2 == 1){
      if(t2 == 0 && tz <= cmp){
      ans2 += tz;
      }
      else if(t2 == 0){
        ans2 += cmp;
      }
      tz = 0;
      cmp += a[i];
      if(t1 == 1 && t2 == 2){
        ans2++;
      }
      t1 = t2;
      t2 = 1;
    }
  }
  System.out.println(ans <= ans2 ? ans:ans2);
}}