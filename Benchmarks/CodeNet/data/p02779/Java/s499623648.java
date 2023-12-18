import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String[] A = new String[n];
      for(int i=0;i<n;i++){
        A[i]=sc.next();
      }
      int after=check(A);
      if(n==after){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
  }      
  static int check(String[] A){
      Set<String> LinkedHashSet = new LinkedHashSet<String>();
      for (int i=0;i<A.length;i++){
        LinkedHashSet.add(A[i]);
      }
      Object[] A_after = LinkedHashSet.toArray();
      return A_after.length;
  }
}