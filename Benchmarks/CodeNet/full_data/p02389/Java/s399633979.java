import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException{
    int area = 0;
    int times = 0;
    int i = 1;
    String s;
    int a = 0;
    int b = 0;
        while(i>0){
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));          
            s = x.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if(a >= 1 && a <= 100 )
                i = -1;
            else if(b >= 1 && b <= 100)
                i = -1;
            else
                i = 1;
         }
        area = a*b;
        times = 2*a+2*b;
        System.out.println(""+area+" "+times+"");    
    }
}