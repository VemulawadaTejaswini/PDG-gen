import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    String[] str = br.readLine().split(" ");

    for (int i = n - 1; i >= 0; i--){
      if (i > 0)
        sb.append(str[i] + " ");
      else if (i == 0)
        sb.append(str[i]);  
    }
    System.out.println(sb);
  }
}