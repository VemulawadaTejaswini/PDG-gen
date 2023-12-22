import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException{
    int sum = 0;
    int n = 0;
    int i = 1;
    String s;
    int a = 0;
    int b = 0;
    int c = 0;
        while(i>0){
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            s = x.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a >= 1 && a <= 10000 )
                i = -1;
            else if(b >= 1 && b <= 10000)
                i = -1;
            else if(c >= 1 && c <= 10000)
                i = -1;
            else if(a <= b)
                i = -1;
            else
                i = 1;
         }
         for(n=a; n<=b;n++){
            if(c%n == 0)
            sum++;
         }
         System.out.println(""+sum+"");
    }
}