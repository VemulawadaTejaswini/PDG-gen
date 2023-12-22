import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        int i = 1;
        int h,m,s;
        int S = 0;
        while(i>0){
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            S = Integer.parseInt(x.readLine());          
            if(S >= 0 && S < 86400 )
                i = -1;
         }
         h = S/3600;
         m = S%3600/60;
         s = S%3600%60;
         System.out.println(""+h+":"+m+":"+s+"");
    }
}