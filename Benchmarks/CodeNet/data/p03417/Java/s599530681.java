import java.io.*;

public class Main{
  public static void main(String[] args) {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int n, m, ind, result = 0;
      String str;

      str = reader.readLine();
      ind = str.indexOf(" ");
      n = Integer.parseInt(str.substring(0, ind));
      m = Integer.parseInt(str.substring(ind+1));

      if(n == 1){
        if(m == 1){
          result = 1;
        }else{
          result = m-2;
        }
      }else if(n == 2){
        result = 0;
      }else{
        if(m == 1){
          result = n-2;
        }else if(m == 2){
          result = 0;
        }else{
          result = (n-2)*(m-2);
        }
      }

      System.out.println(result);
    }
    catch (Exception e) {

    }
  }
}
