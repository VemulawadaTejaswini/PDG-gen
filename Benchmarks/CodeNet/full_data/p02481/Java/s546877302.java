import java.io.*;
class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = 
      new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String[] strs = line.split(" ");
    int height = Integer.parseInt(strs[0]);
    int width = Integer.parseInt(strs[1]);
    System.out.println(height * width + " " + (height + width) * 2);
  }
}