import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int getInt(String a){
        return Integer.parseInt(a);
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = getInt(st.nextToken());
        long d = getInt(st.nextToken());
        int ans = 0;
        d *= d;

        while(n-- != 0){
            st = new StringTokenizer(br.readLine());
            long x = getInt(st.nextToken());
            long y = getInt(st.nextToken());
            if(x*x + y*y <= d){
                ans +=1;
            }
        }
        bw.write(ans+"");

        bw.flush();
        bw.close();
        br.close();
    }
}
