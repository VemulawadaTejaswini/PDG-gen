import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    
    int n1 =0, n2 = 0;
    int s = S.length();
    for(int i = 0; i < s; i++){
      if(S.charAt(i) == '0'){
        n2++;
      }else{
        n1++;
      }
    }
    
    System.out.println(Math.min(n1, n2));
  }
}