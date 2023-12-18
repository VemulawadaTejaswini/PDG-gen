import java.util.Scanner;

public class Main {    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
      	s.useDelimiter("\n");
      	int key = s.nextInt();
      	char[] planeChar = s.next().toCharArray();
      	
      	StringBuilder sb = new StringBuilder();
      	for (int i = 0; i < planeChar.length; i++) {
          int intCipher = (planeChar[i] + key);
          if (intCipher > 90) intCipher -= 26;
          sb.append((char)(intCipher));	
        }
        System.out.println(sb);
  }
}