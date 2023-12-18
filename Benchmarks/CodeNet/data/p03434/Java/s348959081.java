import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    int alice = 0;
    int bob = 0;
    for (int i=0;i<a.length;i++){
      int high = 0;
      int idx = -1;
      for (int j=0;j<a.length;j++){
        if (high<a[j]){
          high = a[j];
          idx = j;
        }
      }
      if ((i+1)%2==0){
        bob = bob + high;
      } else {
        alice = alice + high;
      }
      a[idx] = 0;
    }
    System.out.println(alice - bob);
  }
}