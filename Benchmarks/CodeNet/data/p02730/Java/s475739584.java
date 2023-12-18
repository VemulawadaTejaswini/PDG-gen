import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();
    
    String s1 = s.substring(0, (s.length()-1)/2);
    String s2 = s.substring((s.length()+2)/2);
    
    for (int i=0; i<s1.length(); i++){
      if (s1.charAt(i) != s1.charAt(s1.length()-i-1)){
        System.out.println("No");
        return;
      }
    }
    for (int i=0; i<s2.length(); i++){
      if (s1.charAt(i) != s1.charAt(s1.length()-i-1)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
