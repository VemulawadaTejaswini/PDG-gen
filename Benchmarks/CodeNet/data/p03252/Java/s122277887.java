import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S,T;
    S = sc.next();
    T = sc.next();
    Integer S_Array[] = new Integer[26];
    Integer T_Array[] = new Integer[26];
    Arrays.fill(S_Array, 0);
    Arrays.fill(T_Array, 0);
    String A = "abcdefghijklmnopqrstuvwxyz";
    for(int i=0; i<S.length(); i++){
      for(int j=0; j<A.length(); j++){
        if(S.charAt(i) == A.charAt(j)) S_Array[j]++;
        if(T.charAt(i) == A.charAt(j)) T_Array[j]++;
      }
    }
    Arrays.sort(S_Array);
    Arrays.sort(T_Array);
    boolean ans = true;
    for(int i=0; i<S_Array.length; i++){
      if(S_Array[i] != T_Array[i]){
        ans = false;
        break;
      }
    }
    if(ans == true) System.out.println("Yes");
    else System.out.println("No");
  }
}