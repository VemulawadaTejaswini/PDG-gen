import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int m=0;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]%2==0){
        b[m] = a[i];
        m++;
      }
    }
    if(approved(b)){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
  static boolean approved(int[] n){
    for(int i = 0;i<n.length;i++){
      if(n[i]%3!=0&&n[i]%5!=0){
        return false;
      }
    }
    return true;
  }
}
