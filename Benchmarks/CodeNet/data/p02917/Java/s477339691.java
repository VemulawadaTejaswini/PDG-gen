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
        int n = in.nextInt();
        int m = n-1;
        int [] num  = new int[n-1];
        int last ;
        for (int i =0;i<m;i++){
            num[i]= in.nextInt();
        }
        last = num[m-1];
        int s =num[m-1];
        for (int i=m-2;i>=0;i--){
            int cur = Math.min(num[i],last);
            s+=cur;
            last = cur;
        }
        s+=last;
        System.out.println(s);

    }
}
