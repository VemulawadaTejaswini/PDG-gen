import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);
        String[] buf = reader.readLine().split(" ");
        int X= Integer.parseInt(buf[0]),Y =Integer.parseInt(buf[1]);
        int Z = Integer.parseInt(buf[2]), K = Integer.parseInt(buf[3]);
        long[] a = new long[X], b = new long[Y], c = new long[Z];
        buf = reader.readLine().split(" ");
        for(int i=0;i<X;i++) a[i]=Long.parseLong(buf[i]);
        buf = reader.readLine().split(" ");
        for(int i=0;i<Y;i++) b[i]=Long.parseLong(buf[i]);
        buf = reader.readLine().split(" ");
        for(int i=0;i<Z;i++) c[i]=Long.parseLong(buf[i]);
        //Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
        int idx=0;
        long[] bc = new long[Y*Z];
        for(int i=0;i<Y;i++){
            for(int j=0;j<Z;j++) bc[idx++] = b[i]+c[j];
        }
        Arrays.sort(bc);
        ArrayList<Long> dic = new ArrayList<>();
        int lower = Math.max(0,bc.length-K);
        for(long w:a){
            for(int i=bc.length-1;i>=lower;i--){
                dic.add(w+bc[i]);
            }
        }
        Collections.sort(dic,Collections.reverseOrder());
        for(int i=0;i<K;i++) out.println(dic.get(i));
        out.flush();
    }
}