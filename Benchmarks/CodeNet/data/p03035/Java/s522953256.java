import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 0;
        if(a>=6&&a<=12) b/=2;
        else  if(a<=5) b = 0;
        ans = b;
        System.out.println(ans);

    }
}

