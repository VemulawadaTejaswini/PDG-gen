import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int AC =0, WA=0, TLE =0,RE=0;
    String AC1="AC", WA1="WA", TLE1="TLE", RE1 ="RE";
    for(int i=0; i<n; i++){
      if(AC1.equals(br.readLine())) AC++;
      else if(WA1.equals(br.readLine())) WA++;
      else if(TLE1.equals(br.readLine())) TLE++;
      else RE++;
    }
    System.out.println(AC1+" x "+AC);
    System.out.println(WA1+" x "+WA);
    System.out.println(TLE1+" x "+TLE);
    System.out.println(RE1+" x "+RE);
  }
}