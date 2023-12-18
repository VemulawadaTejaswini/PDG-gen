import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[][] m = new char[2][3];
    
    for(int i = 0 ; i < 2; i++){
      String tmp = sc.next();
      char[] S = tmp.toCharArray();
      for(int j = 0; j < 3; j++){
        m[i][j] = S[j];
      }
    }
    
    if(m[0][0] == m[1][2] && m[0][1] == m[1][1] && m[0][2] == m[1][0]){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
   
  }
}