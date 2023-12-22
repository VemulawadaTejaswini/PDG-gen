import java.io.*;

public class C {
  public static void main(String[] args){
      System.out.println("面積と周の長さを出力します");
      BufferedReader reader = new BufferedReader(new InputStreamReader ( System . in ) ) ;
      try {
      int a,b = 0;
      String line = reader.readLine();
        a = Integer.parseInt(line);
        line = reader.readLine();
        b = Integer.parseInt(line);

      if(1<=a && a<=100 && 1<=b && b<=100){
        System.out.printf("面積は"+a*b+" ");
        System.out.println("周の長さは"+2*(a+b));
      }else{
          System.out.println("数値が範囲外です");
      }
      }catch (IOException e){
        System.out.println(e);
          }
  }
}
