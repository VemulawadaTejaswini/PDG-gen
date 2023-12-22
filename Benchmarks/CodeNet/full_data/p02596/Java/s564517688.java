import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());

        HashSet<Long> hash = new HashSet<Long>();
        long val = 0;
        for(int i=1;;i++){
            val = ((val * 10) + 7) % k;
            if(val == 0){
                bw.write(i+"");
                break;
            }
            if(hash.contains(val)){
                bw.write("-1");
                break;
            }
            hash.add(val);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
