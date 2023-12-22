import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) {
    try {
      BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
      String input = stdReader.readLine();
      StringBuilder output = new StringBuilder();
      
      for (int i = 0; i < input.length(); i++) {
        int c = (int)input.charAt(i);
        if     (c >= 65 && c <= 90)  output.append(lowerCase(input.charAt(i)));
        else if(c >= 97 && c <= 122) output.append(upperCase(input.charAt(i)));
        else                         output.append(input.charAt(i));
      }
      System.out.println(output.toString());
    } catch (Exception e) {
      System.out.println(e);
    }
  }
  
  public static char lowerCase(char c){
    return (char)(c + 32);
  }
  
  public static char upperCase(char c){
    return (char)(c - 32);
  }
}