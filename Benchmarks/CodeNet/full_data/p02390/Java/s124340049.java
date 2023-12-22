import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main{
    public static void main(String args[])throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //変数に配列を代入
        int s =Integer.parseInt(line);
        int h = s / 3600;
        int m = (s % 3600) / 60;
        s = s % 60;
        System.out.println(h+":"+m+":"+s);
        
    }
}