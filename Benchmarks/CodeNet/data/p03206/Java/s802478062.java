import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String ans = "";
    switch(str) {
      case "25" :
        ans = "Christmas";
        break;
      case "24" :
        ans = "Christmas Eve";
        break;
      case "23" :
        ans = "Christmas Eve Eve";
        break;
      case "22" :
        ans = "Christmas Eve Eve Eve";
        break;
    }
    System.out.println(ans);
  }
}