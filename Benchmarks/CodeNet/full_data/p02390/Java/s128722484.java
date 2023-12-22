import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine();
        int sec = Integer.parseInt(str);
        int h = (int)sec/3600;
        int m = (int)(sec-(h*3600))/60;
        int s = sec%60;

        System.out.println( h + ":" + m + ":" + s );


    }
    catch(Exception e){
       
    }
  }
}
