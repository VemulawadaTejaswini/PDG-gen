import java.io.*;
class Main {
  public static void main (String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s;
    while(null != (s = in.readLine()))
      calc(Double.parseDouble(s));
  }
  private static void calc(double a){
    double sum = 0;
    for(int i=0;i<10;i++){
      sum+=a;
      a=((i&1)==0)?a*2.0:a/3.0;
    }
    System.out.println(sum);
  }
}