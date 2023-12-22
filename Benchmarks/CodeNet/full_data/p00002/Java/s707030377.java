import java.io.*;

public class Main{
   public static void main(String[] args)throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] t = br.readLine().split(" ");
       int a = Integer.parseInt(t[0]);
       int b = Integer.parseInt(t[1]);
       int count = 0;
       int sum = a+b;
       int i = 1;
       while(true){
         if(sum/i<1){
            break;
         }
         count++;
         i = i*10;
       }
       System.out.println(count);
   }
}