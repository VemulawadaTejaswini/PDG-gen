import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder output = new StringBuilder();
    String crlf = System.getProperty("line.separator");
    int[] alphabet = new int[26];
    
    while (in.hasNext()) {
      String input = in.next();
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i); 
        if ((ch >= 'A' && (int)ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
          int count = ch % 32 - 1;
          alphabet[count]++;
        }
      }
    }
    
    for (int i = 0; i < alphabet.length; i++) {
      output.append((char)(i + 'a')).append(" : ").append(alphabet[i]);
      if (i != alphabet.length - 1) output.append(crlf);
    }
    System.out.println(output.toString());
  }
}