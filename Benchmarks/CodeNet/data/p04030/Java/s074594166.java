import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    String ans = "";
    for(int i=0; i<input.length(); i++){
      ans = pressKey(input.charAt(i), ans);
    }
    System.out.println(ans);
  }
  
  private static String pressKey(char c, String str){
    if(c == '0'){
      return str+"0";
    }
    if(c == '1'){
      return str+"1";
    }
    if(str.equals("")){
      return str;
    }
    if(c == 'B'){
      StringBuilder builder = new StringBuilder(str);
      builder.deleteCharAt(builder.length()-1);
      return builder.toString();
    }
    return null;
  }
}
