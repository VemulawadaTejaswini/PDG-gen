import java.io.*;
 
public class Main {
    try{
        public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String textline = br.readLine();
        double x = Math.pow(Integer.parseInt(textline), 3);
        System.out.println((int)x);
        br.close();
       }
      catch IOException{}
    }
}