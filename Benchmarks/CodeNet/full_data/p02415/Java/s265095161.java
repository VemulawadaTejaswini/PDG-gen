import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();

    String s = sc.nextLine();

    for(int i = 0; i < s.length(); i++){
      if(Character.isUpperCase(s.charAt(i))){
        String tmp = String.valueOf(s.charAt(i)).toLowerCase();
        sb.append(tmp);
      } else if(Character.isLowerCase(s.charAt(i))){
        String tmp = String.valueOf(s.charAt(i)).toUpperCase();
        sb.append(tmp);
      } else {
        String tmp = String.valueOf(s.charAt(i));
        sb.append(tmp);
      }
    }

    String ans = sb.toString();
    System.out.println(ans);
  }
}

