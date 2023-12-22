import java.io.*;                            //入出力用パッケージを利用する
class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    String s;
    s = buf.readLine();
    int x = parseInt(str);
    System.out.println(Math.pow(x,3));
  }
}