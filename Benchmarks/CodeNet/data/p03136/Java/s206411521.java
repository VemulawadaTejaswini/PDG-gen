import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int[] l = new int[n];
                for(int i = 0 ; i < n ; i++){
                        l[i] = Integer.parseInt(sc.next());
                }
                sc.close();
                Arrays.sort(l);
                for(int i = 0 ; i < n - 1 ; i++){
                        l[n - 1] -= l[i];
                }
                if(l[n - 1] >= 0) ou.print("No\n");
                else ou.print("Yes\n");
                ou.flush();
        }
}