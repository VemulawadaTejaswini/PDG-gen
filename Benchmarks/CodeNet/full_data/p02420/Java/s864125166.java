import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] Args) throws IOException{
        while(true){
            final String str = br.readLine();
            if(str.equals("-")) break;
            final int m = Integer.parseInt(br.readLine());
            int h = 0;
            for(int i = 0; i<m; i++)
                h += Integer.parseInt(br.readLine());
            h %= str.length();
            out.println(str.substring(h)+str.substring(0, h));
        }
        out.flush();
    }
}