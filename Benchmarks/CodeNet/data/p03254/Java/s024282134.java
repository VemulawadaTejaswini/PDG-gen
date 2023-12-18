import java.util.*;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int n = sc.nextInt();
 long x = sc.nextLong();
 Long[] a = new Long[n];
 for(int i=0;i<n;i++) {
  a[i] = sc.nextLong();
 }
 Arrays.sort(a);
 int ans = 0;
 for(int i=0;i<n;i++) {
  if(x - a[i] >= 0) {
   x -= a[i];
   ans++;
  }
  else {
    break; 
  }
 }
 if(x > 0 && ans == 0)
   ans--;
 System.out.println(ans);}
}
