import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();  // input Integer
    String a = sc.next();  // input String
    String b = sc.next();  // input String
    int ans = 10000;
    int loop = a.length() - b.length() + 1;
    if (a.contains(b)){
      System.out.println(0);
    } else {
      for (int i=0; i<loop ;i++){
        int tmp=0;
        String sub = a.substring(i,i+b.length());
        for (int j=0 ; j<sub.length();j++){
          if(sub.charAt(j) != b.charAt(j)){
            tmp++;
          }
        }
        if(ans>tmp){
          ans=tmp;
        }
      }
      System.out.println(ans);
    }
  }
}
