import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String args[]){
      String str ;
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       try {
            str = reader.readLine();
            reader.close();
         	String[] astr = str.split(" ");
      long n = Long.parseLong(astr[0]);
      long k = Long.parseLong(astr[1]);
      double result = 0;
      for(long i = 1; i <= n; i++){
          long p = 0, a = i;	
          while(a < k){
              a = a * 2;
              p++;
          }
          double tmp = 0.5;
          for(long j = 1; j < p; j++){
              tmp = tmp * 0.5;
          }
        if(p != 0)
          result = result + tmp;
        else
          result = result + 1;
      }
      result = result / n;
      System.out.print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
  }
}
