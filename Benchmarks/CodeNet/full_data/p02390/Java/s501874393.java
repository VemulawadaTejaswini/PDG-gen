import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
   public static void main(String[] args) {
     try{
     //入力される秒数S
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
     //秒数をh,m,sに分けて表示する
     int h = n/3600;
     int m = (n%3600)/60;
     int s = n%60;
     System.out.println(h+":"+m+":"+s);
   }catch(IOException e){
     e.printStackTrace();
   }
    }
}

