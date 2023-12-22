import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      int r = sc.nextInt();
      if(n==0 && r==0) break;
      int[] a = new int[n];
      for(int i=0;i<n;i++){
        a[i] = n-i;
      }
      
      while(r>0){
        int p = sc.nextInt();
        int c = sc.nextInt();
        int[] b = new int[p];
        for(int i=0;i<p-1;i++){
          b[i] = a[i];
        }for(int i=0;i<c;i++){
          a[i] = a[p-1+i];
        }for(int i=0;i<p-1;i++){
          a[c+i] = b[i];
        }
        r--;
      } System.out.println(a[0]);
    }
    sc.close();
  } 
}
