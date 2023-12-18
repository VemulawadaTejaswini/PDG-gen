import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] arigs) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(reader.readLine());
    if(N>=100 && N<=700){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    reader.close();
  }
}