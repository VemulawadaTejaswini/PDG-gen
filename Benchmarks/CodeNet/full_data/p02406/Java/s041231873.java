import java.io.*;

class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    for(int i = 1; i <= n; i++){
      if(i % 3 == 0)
        sb.append(" " + i);
      else if(i % 10 == 3)
        sb.append(" " + i);
    }
    System.out.println(sb);
  }
}