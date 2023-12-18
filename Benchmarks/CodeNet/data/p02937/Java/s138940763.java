import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String S = s.next();
    String T = s.next();
    char[] c = T.toCharArray();
    int search = 0;
    int i = 0;
    int[] List = new int[T.length()];
    while (i<T.length()){
      search = S.indexOf(String.valueOf(c[i]));
      if (search == -1){
        break;
      }
      else{
        List[i] = search;
        S.replaceFirst(String.valueOf(c[i]),"0");
      }
      i += 1;
    }
    if (search == -1){
      System.out.println("-1");
    }
    else{
      long A = 0;
      for(int j =0;j<T.length()-1;j++){
        if(List[j] > List[j+1]){
          A += 1;
        }
      }
      System.out.println((S.length() * A) + List[T.length()-1]+1);
    }
  }
}