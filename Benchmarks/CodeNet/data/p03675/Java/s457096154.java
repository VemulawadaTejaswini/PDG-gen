import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
      for(int j=0;j<=i;j++){
        b[i-j] = a[j];
      }
    }
    String ans = Arrays.toString(b);
    System.out.println(ans);
  }
}