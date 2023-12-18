import java.util.Scanner;

public class Main { 
    
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      s.useDelimiter("\n");
      int key = s.nextInt();
      char[] planeChars = s.next().toCharArray();
     
      String cipher = cipherBuilder(planeChars, key);
      System.out.println(cipher);
    }
  
  public static String cipherBuilder(char[] planeChars, int key) {
    
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int placeCharLen = planeChars.length;
    
    StringBuilder cipherSB = new StringBuilder();
      for (int i = 0; i < placeCharLen; i++) {
      	int index = alphabet.indexOf(planeChars[i]);
        if (index + key > 26) index = index + key - 26;
        cipherSB.append(alphabet.charAt(index + key));
      }
      return cipherSB.toString();
  }
}