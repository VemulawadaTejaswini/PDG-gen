import java.io.PrintWriter;
import java.util.*;

public class Main{
    static PrintWriter out;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        out=new PrintWriter(System.out);

        long a[]=new long[4];
        for (int i = 0; i <4 ; i++) {
            a[i]=sc.nextInt();
        }
        out.println(Math.max(a[0]*a[2],Math.max(a[0]*a[3],Math.max(a[1]*a[2],a[1]*a[3]))));


        sc.close();
        out.close();
    }




}