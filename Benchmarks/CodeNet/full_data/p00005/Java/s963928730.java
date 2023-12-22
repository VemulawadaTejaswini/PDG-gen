import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String[] args) throws IOException{
    long num1,num2,kouyakusu=0;
    String str="";
    BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

    while((str=buf.readLine()) != null){
      num1 = Long.parseLong(str.substring(0, str.indexOf(" ")));
      num2 = Long.parseLong(str.substring(str.indexOf(" ")+1, str.length()));
      kouyakusu = kouyakusu(num1,num2);
      System.out.println(kouyakusu+" "+num1*num2/kouyakusu);
    }
  }
  public static long kouyakusu(long num1,long num2){
    long x = (num1>num2)? num1 : num2;
    long y = (num1>num2)? num2 : num1;
    long tmp = 0;
    while((tmp = x%y)!=0){
      x = y;
      y = tmp;
    }
    return y;
  }



}