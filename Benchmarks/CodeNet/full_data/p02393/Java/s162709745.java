import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException{
    int sub1 = 0;
    int sub2 = 0;
    int sub3 = 0;
    int i = 1;
    String s;
    int a = 0;
    int b = 0;
    int c = 0;
    int cn = 0;
        while(i>0){
            BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
            s = x.readLine();
            StringTokenizer st = new StringTokenizer(s," ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            if(a >= -1000 && a <= 1000 )
                i = -1;
            else if(b >= -1000 && b <= 1000)
                i = -1;
            else if(c >= -1000 && c <= 1000)
                i = -1;
            else
                i = 1;
         }
        sub1 = b-c;
            if(sub1>0){
            cn = b;
            b = c;
            c = cn;
            sub2 = a-b;
                if(sub2>0){
                cn = a;
                a = b;
                b = cn;
                sub3 = b-c;
                    if(sub3>0){
                    cn = b;
                    b = c;
                    c = cn;
                    }
                }
            }
            else{
            sub2 = a-b;
                if(sub2>0){
                cn = a;
                a = b;
                b = cn;
                sub3 = b-c;
                    if(sub3>0){
                    cn = b;
                    b = c;
                    c = cn;
                    }
                }
            }            
    System.out.println(""+a+" "+b+" "+c+"");
    }
}