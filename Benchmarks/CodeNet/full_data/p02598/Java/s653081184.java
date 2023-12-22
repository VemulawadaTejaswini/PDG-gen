import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int k = Integer.parseInt(sc.next());
                int[] a = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = Integer.parseInt(sc.next());
                }
                sc.close();
                double le = 0;
                double ri = Math.pow(10 , 9);
                while(ri - le > 0.00001){
                        double now = (le + ri) / 2;
                        int yono = 0;
                        for(int i = 0 ; i < n ; i++){
                                yono += (int)(a[i] / now);
                        }
                        if(yono > k) le = now;
                        else ri = now;
                }
                ou.print((int)Math.ceil((le + ri) / 2) + "\n");
                ou.flush();
        }
}