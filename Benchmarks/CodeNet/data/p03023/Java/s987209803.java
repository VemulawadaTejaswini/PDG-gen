import java.io.*;
import java.util.*;


public class Main {
    static HashMap<Integer,Integer>[] g; //<toRoom, keyNecessary>
    static int n,m;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        //n = Integer.parseInt(buf[0]); m = Integer.parseInt(buf[1]);
        int n = sc.nextInt();
        int ans = 180+(n-3)*180;
        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
    }
}

