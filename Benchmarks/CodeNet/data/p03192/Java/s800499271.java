import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String s = br.readLine();

    br.close();

    int ans = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == '2') ans++;
    }

    System.out.println(ans);
  }
}