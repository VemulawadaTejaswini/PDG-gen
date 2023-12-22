import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    String str1 = br.readLine();
    String[] str2 = str1.split(" ");
    int n = Integer.parseInt(str2[0]);

    for (int i = 1; i <= n; i++){
      if (i % 3 == 0){
        sb.append(" " + i);
        continue;
      }
      if (i % 10 == 3){
        sb.append(" " + i);
        continue;
      }
    }
    System.out.println(sb);
  }
  }