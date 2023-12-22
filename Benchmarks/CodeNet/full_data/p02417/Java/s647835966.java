import java.util.Scanner;
import java.io.*;



public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    try{
      String s = readAll().toLowerCase();
      byte[] b = s.getBytes("US-ASCII");
      int[] al = new int[26];
      int a = 97;
      int z = 122;
      for(int i = 0; i < 26; i++){
        al[i] = 0;
      }

      for(int v: b){
        if(v >= a&& v <= z){
          al[v - a]++;
        }
      }
      for(int i = 0; i < 26; i++){
        System.out.printf("%c : %d\n", (char) (i + a), al[i]);
      }
      //System.out.printf("%s\n", s);
    }catch(Exception e){}
  }

  public static String readAll() throws IOException {
    StringBuilder builder = new StringBuilder();

    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
        String string = reader.readLine();
        while(string != null){
            builder.append(string + System.getProperty("line.separator"));
            string = reader.readLine();
        }
    }

    return builder.toString();
}
}
