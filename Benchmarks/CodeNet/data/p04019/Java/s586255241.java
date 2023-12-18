import java.util.*;

public class Wanna_go_back_home{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String S_s[] = s.split("");
    String N = "N";
    String W = "W";
    String S = "S";
    String E = "E";
    int x = 0;
    int y = 0;
    for(int i = 0;i < s.length();i++){
      if(S_s[i].equals(N)) x++;
      else if(S_s[i].equals(W)) y--;
      else if(S_s[i].equals(S)) x--;
      else if(S_s[i].equals(E)) y++;
    }
    if(x == 0 && y == 0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
