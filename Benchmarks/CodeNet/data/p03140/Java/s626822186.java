import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    int n = Integer.parseInt(in[0]);

    String a = br.readLine();
    String b = br.readLine();
    String c = br.readLine();

    br.close();

    int ans = 0;

    for(int i = 0; i < n; i++){
      int sameNum = 0;
      if(a.charAt(i) == b.charAt(i)) sameNum++;
      if(b.charAt(i) == c.charAt(i)) sameNum++;
      if(c.charAt(i) == a.charAt(i)) sameNum++;

      int add = 0;
      if(sameNum == 0) add = 2;
      if(sameNum == 1) add = 1;

      ans += add;
    }

    System.out.println(ans);
  }
}