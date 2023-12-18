import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChangeChracter {
	
  public static void main(String[] args) {
	  int n,k;
	  char[] ch;
	  String line;
    try {
      BufferedReader stdin =
        new BufferedReader(new InputStreamReader(System.in));
      
      n = stdin.read();
      k = stdin.read();
      line = stdin.readLine();
      
      
      ch = new char[line.length()];
      for(int i = 0; i < line.length(); i++) {
    	  ch[i] = line.charAt(i);
      }
      
      switch(ch[k-1]) {
      case 'A':
    	  ch[k-1] = 'a';
    	  break;
      case 'B':
    	  ch[k-1] = 'b';
    	  break;
      case 'C':
    	  ch[k-1] = 'c';
    	  break;
      }
      
      String s = new String(ch);
      System.out.println(s);
      
      stdin.close();
      System.out.println("\nPROGRAM END");
    } catch (Exception e) {
      e.getStackTrace();
      System.exit(-1); // プログラムを終了
    }
  }
}