        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Watch {
    public static void main (String[] args) throws IOException {
        int secand,h,m,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        secand = Integer.parseInt(br.readLine());
        h = secand/3600;
        secand = secand % 3600;
        m = secand/60;
        s = secand%60;
        System.out.println(h+":"+m+":"+s);
    }
}