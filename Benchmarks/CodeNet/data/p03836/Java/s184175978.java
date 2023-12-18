import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int sx = in.nextInt();
        int sy = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();
        int u = ty-sy;
        int r = tx-sx;
        String t = "";
        for(int i=0;i<u;i++){
            t+="U";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<r;i++){
            t+="R";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<u;i++){
            t+="D";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<r+1;i++){
            t+="L";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<u+1;i++){
            t+="U";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<r+1;i++){
            t+="R";
        }
        t+="DR";
        System.out.print(t);
        t="";
        for(int i=0;i<u+1;i++) {
            t += "D";
        }
        System.out.print(t);
        t="";
        for(int i=0;i<r+1;i++){
            t+="L";
        }
        System.out.print(t+"U");

    }
}
