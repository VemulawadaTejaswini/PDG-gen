import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    
    String ans = "snuke";
    char[] c = new char[2];
    for(int i = 0; i < H; i++){
      String[] T = sc.nextLine().split(" ");
      for(int j = 0; j < W; j++){
        if(T[j].equals(ans)){
          c[1] = (char)(i+1 + '0');
          c[0] = (char)(j + 'A');
          System.out.println(new String(c));
          return;
        }
      }
    }
  }
}