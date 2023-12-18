import java.util.*;
import javax.script.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    int k = sc.nextInt();
    long[] r = new long[k];
    String suna = "a";
    String sunaf = new String[k];
    for(int i = 0; i < k; i++) {
      r[i] = sc.nextLong();
      if(i % 2 == 0) {
        long hiki = 0;
        if(i == 0) {
          hiki = r[i];
        } else {
          hiki = r[i] - r[i - 1];
        }
        sunaf[i] = "Math.max(0, " + suna + " - " + hiki + ")";
      } else {
        long tasi = r[i] - r[i - 1];
        sunaf[i] = "Math.min(x, " + suna + " + " + tasi + ")";
      }
      suna = sunaf[i];
    }
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      long t = sc.nextLong();
      long a = sc.nextLong();
      int timei = k - 1;
      int left = 0;
      int right = k;
      while(left < right) {
        int med = (left + right) / 2;
        if(r[med] <= t) {
          timei = med;
          left = med + 1; 
        } else {
          right = med;
        }
      }
ScriptEngineManager factory = new ScriptEngineManager();
ScriptEngine engine = factory.getEngineByName("JavaScript");
      long nowsuna = 0;
      if(timei == k - 1) {
        if(timei % 2 == 0) {
          nowsuna = (Long)engine.eval("Math.min(x, " + sunaf[i] + " + (t - r[timei]) + ")");
        } else {
          nowsuna = (Long)engine.eval("Math.max(0, " + sunaf[i] - " + (t - r[timei]) + ")");
        }
      } else {
        if(timei % 2 == 0) {
          nowsuna = (Long)engine.eval("Math.min(x, " + sunaf[i] + " + (t - r[timei]) + ")");
        } else {
          nowsuna = (Long)engine.eval("Math.max(0, " + sunaf[i] - " + (t - r[timei]) + ")");
        }
      }
    }
    System.out.println(ans);
  }
}