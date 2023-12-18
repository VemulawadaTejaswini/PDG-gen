import java.io.*;

public class Main {

  static String s;

  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    //String[] in = br.readLine().split(" ");
    s = br.readLine();

    br.close();
    boolean hasSeven = false;
    for(int i = 0; i < 3; i++){
      if(s.charAt(i) == '7') hasSeven = true;
    }

    System.out.println(hasSeven ? "Yes" : "No");

  }
}