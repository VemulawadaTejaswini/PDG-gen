import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int H = Integer.parseInt(S[0]);
    int W = Integer.parseInt(S[1]);
    
    String ans = "snuke";
    for(int i = 0; i < H; i++){
      String[] T = sc.nextLine().split(" ");
      for(int j = 0; j < W; j++){
        if(T[j].equals(ans)){
          String s1 = String.valueOf((char)(j + 'A'));
          String s2 = (i+1) + "";
          System.out.println(s1 + s2);
          return;
        }
      }
    }
  }
}