import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int[] a=new int[n];
    for(int i=1;i<n;i++){
      for(int j=i+1;j<=n;j++){
        a[Math.min(Math.abs(x-i)+1+Math.abs(j-y),j-i)]++;
      }
    }
    for(int i=1;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}