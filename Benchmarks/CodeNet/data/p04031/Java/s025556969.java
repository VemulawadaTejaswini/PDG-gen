import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    int c[] = new int[201];
    for(int i=0;i<=200;i++){
      c[i]=calc(i-100,a);
    }
    Arrays.sort(c);
    System.out.println(c[0]);
    
  }
  public static int calc(int n,int[] a){
    int res =0;
    for(int i=0;i<a.length;i++){
      res=res+(a[i]-n)*(a[i]-n);
    }
    return res;
    
    
    
  }
  

  
}