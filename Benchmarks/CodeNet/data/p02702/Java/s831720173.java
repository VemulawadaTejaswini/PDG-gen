import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args)throws Exception {
        StringBuilder sb = new StringBuilder();
        FastReader in = new FastReader(System.in);
        int i, j;
        char arr[]=in.next().toCharArray();
        int n=arr.length;
        if(n<=3){
            System.out.println(0);
            System.exit(0);
        }
        int val[]={0,201,403,605,807,1009,1211,1413,1615,1817};
        HashMap<Integer,Integer> map=new HashMap<>(0);
        long ans=0;
        for(i=0;i<n;i++){
            int x=arr[i]-'0';
            //System.out.println(map+" "+x);
            ans=ans+map.getOrDefault(val[(10-x)%10],0);
            HashMap<Integer,Integer> map2=new HashMap<>();
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                int key=entry.getKey();
                int va=entry.getValue();
                map2.put(((key*10)+x)%2019,va);
            }
            map=map2;
            int z=map.getOrDefault(x,0);
            map.put(x,z+1);
        }
        System.out.println(ans);


    }
}

class FastReader {

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastReader(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}



