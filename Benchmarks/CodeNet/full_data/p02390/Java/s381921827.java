1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Watch {
    public static void main(String[] args) throws IOException {
        int t = 0;
        int s = 0;
        int m = 0;
        int h = 0;
 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
         t = Integer.parseInt(br.readLine());//数値
        //String buf = br.readLine();
 
        if (t >= 0 && t < 86400)
        {
            h = t / 3600;
            m = t % 3600 / 60;
            s = t % 60;
            System.out.println(h+":"+m+":"+s);
        }
    }
}
