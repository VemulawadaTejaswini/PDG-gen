import java.io.*;

class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str1 = br.readLine();
    String[] str2 = str1.split("?\n");
    int num[] = new int[str2.length];
    for (int i = 0; i < str2.length; i++){
      num[i] = Integer.parseInt(str2[i]);
    }
    for (int i = 0; i < num.length; i++){
      if(num[i] != 0)
        System.out.println("Case" + " " + (i + 1) + ":" + " " + num[i]);
      else
        break;
    }
  }
}