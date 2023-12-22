import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        int i = 1;
        int xcubic;
        int a = 0;
        while(i>0){
            System.out.println("数字を入力して下さい（1以上100以下）");
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(x.readLine());
            
            if(a > 1 && a<100 )
                i = -1;
         }
         xcubic = a*a*a;
         System.out.println(xcubic);
    }
}