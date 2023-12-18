import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.sort(b);

    int count = 0;
    for(int i = b.length - 1; i >= 0; i--){
      if(b[i] < a[a.length - 1]) break;
      h -= b[i];
      count++;
    }
    
    System.out.println(count + (int)Math.ceil(h / (double)a[a.length - 1]));
  }
}