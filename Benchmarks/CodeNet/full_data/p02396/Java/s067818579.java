import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
  public static void main(String[] args){
    try{
      for(int i = 1; i <= 10000; i++){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (Integer.parseInt(str) == 0){
          break;
        }
        System.out.println("Case " + i + ":" + Integer.parseInt(str));
      }
    } catch (IOException e){
      System.out.println(e.toString());
    }
  }
}
