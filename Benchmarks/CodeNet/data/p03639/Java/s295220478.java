import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int ok = 0;
    int two = 0;
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      if(a[i]%4==0){
        ok+=3;
      }else if(a[i]%2==0){
        if(two==0){
          two++;
        }else{
          two=0;
          ok+=2;
        }
      }
    }
    if(ok>=n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
