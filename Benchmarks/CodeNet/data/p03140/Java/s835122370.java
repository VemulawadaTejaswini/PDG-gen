import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String A = sc.next();
    String B = sc.next();
    String C = sc.next();
    
    Map<Character, Integer> map = new HashMap<>();
    int count = 0;
    for(int i = 0; i < N; i++){
      if(A.charAt(i) == B.charAt(i) && B.charAt(i) == C.charAt(i)){
        
      }else if(A.charAt(i) == B.charAt(i) || B.charAt(i) == C.charAt(i) || C.charAt(i) == A.charAt(i)){
        count++;
      }else{
        count += 2;
      }
    }
    
    System.out.println(count);
  }
}