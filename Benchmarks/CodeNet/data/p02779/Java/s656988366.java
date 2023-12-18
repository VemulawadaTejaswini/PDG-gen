import java.util.*;
 
class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    String ans = "No";
    Set<Integer> A = new HashSet<>();
    for(int i = 0; i < N; i++){
      A.add(sc.nextInt());
    }
    if(A.size() = N){
      ans = "Yes";
    }    
    System.out.println(ans);
    }
}
    
    