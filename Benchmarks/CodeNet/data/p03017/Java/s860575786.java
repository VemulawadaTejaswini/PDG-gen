import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      String s = sc.next();
      String ans = "Yes";
      if(s.charAt(C-1)=='#' || s.charAt(D-1)=='#'){
          ans = "No";
      }
      if(D<C){
        String str = s.substring(A-1,C);
        if(str.contains("##")){
           ans = "No";
        }
        str = s.substring(B-1,D);
        if(!(str.contains("..."))){
          ans = "No";
        }
      }else{
        String str = s.substring(A-1,D);
        if(str.contains("##")){
           ans = "No";
        }
      }
      System.out.println(ans);
    }
}
