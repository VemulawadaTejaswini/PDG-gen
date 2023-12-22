import java.util.*;

class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int x = 0;
 int[] a = new int[n];
for(int i = 0; i < n; i++){
   a[i] = sc.nextInt();
   x += a[i];
}
int max = a[0];
int mox = a[0];
for(int i = 1; i <= n; i++){
  if(max < a[i])max = a[i];
  if(mox > a[i])mox = a[i];
}
System.out.println(mox + " " + max + " " + x);
}
}