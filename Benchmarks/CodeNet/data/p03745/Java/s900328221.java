import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader();
        //InputStream inputStream = System.in;
        //Scanner in = new Scanner(inputStream);
        OutputStream outputStream = System.out;
        PrintWriter out = new PrintWriter(outputStream);
        long mod = (int)1e9+7;
        int n = in.ni();
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = in.ni();
        ArrayList<Long> al = new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1])
                al.add(arr[i]);
        }
        int count = 1;
        int len = al.size();
        for(int i=1;i<len-1;i++){
            long temp = al.get(i)-al.get(i-1);
            long temp2 = al.get(i+1)-al.get(i);
            if(temp*temp2<0) {
                count++;
                i++;
            }
        }
        out.println(count);
        out.close();
    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String n() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        int ni() {
            return Integer.parseInt(n());
        }

        long nl() {
            return Long.parseLong(n());
        }

        double nd() {
            return Double.parseDouble(n());
        }

        String nli() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                throw new RuntimeException();
            }
            return str;
        }
    }
}
