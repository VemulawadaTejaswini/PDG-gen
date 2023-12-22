import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine())!=null) {

            String[] splited =  line.split(" ", 6);
            int a = Integer.parseInt(splited[0]);
            int b = Integer.parseInt(splited[1]);
            int c = Integer.parseInt(splited[2]);
            int d = Integer.parseInt(splited[3]);
            int e = Integer.parseInt(splited[4]);
            int f = Integer.parseInt(splited[5]);

            double y = (a * f / d - c ) / (a * e - b);
            double x = x = (c - b * y) / a;

            String output = String.format("%.3f %.3f", x, y);
            System.out.println(output);
        }
    }
}

/*


ax+by=c
dx+ey=f

ax = c - by
x = (c - by) / a

d((c - by) / a) + ey = f
(c -by) / a + ey = f /d
c - by + aey = af / d
- by + aey = af/d - c
(ae - b) y = af/d - c
y = (af /d -c )/(ae -b)

*/