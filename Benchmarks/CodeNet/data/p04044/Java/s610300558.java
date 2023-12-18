import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int L = Integer.parseInt(sc.next());
    String S[] = new String[L];
    for(int i=0; i<N; i++){
      S[i]=sc.next();
    }
    Arrays.sort(S);
    String s = "";
    for(int i=0; i<L; i++){
      s += S[i];
    }
    System.out.println(s);
  }
}
      