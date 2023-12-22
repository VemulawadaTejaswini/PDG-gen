import java.util.*;
import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        PrintWriter out = new PrintWriter(System.out);

        if(t>=30)
            out.println("Yes");
        else
            out.println("No");

        out.close();
    }
    

}

