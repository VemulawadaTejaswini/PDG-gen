import java.util.*;
import java.io.*;

public class Main {
    
    static int m;
    static int n;
    static ArrayList<Integer>[] next;
    static boolean[] dp;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st=new StringTokenizer(br.readLine());
        String str=br.readLine();
        int i=0;
        while(str.charAt(i)!='A'){ i++; }
        int j=str.length()-1;
        while(str.charAt(j)!='Z'){ j--; }
        System.out.println(j+1-i);
    }
    
}
