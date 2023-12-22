import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int a = Integer.parseInt(str2[0]);
    int b = Integer.parseInt(str2[1]);

    if (a < b)
      System.out.println("a < b");
    else if (a > b)
      System.out.println("a > b");
    else
      System.out.println("a == b");
    }
}