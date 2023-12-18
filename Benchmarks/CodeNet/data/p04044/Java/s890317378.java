import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String S[] = new String[L];
    for(int i=0; i<L; i++){
      S[i]=sc.next();
    }
    Arrays.sort(S);
    for(int i=0; i<L; i++){
      System.out.print(S[i]);
    }
    System.out.println();
  }
}
      