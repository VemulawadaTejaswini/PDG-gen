import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        int start = 39;
        if(A == 0 && B == 0) {
            System.out.println(0);
        }else {
            while(true) {
                if((long)Math.pow(2, start) <= B)break;
                start--;
            }
            long[] count = new long[start + 1];
            Queue<String> q = new LinkedList<String>();
            
            String result = "";
            q.add(A+","+B+","+start);
            while(!q.isEmpty()) {
                String[] res = q.poll().split(",");
                long resa = Long.parseLong(res[0]);
                long resb = Long.parseLong(res[1]);
                int pow = Integer.parseInt(res[2]);
                long pow_num = (long)Math.pow(2, pow);
                long upper = resb - pow_num;
                
                if(resa < pow_num && resa != 0) {
                    q.add(resa+","+Math.min(resb, pow_num - 1)+","+(pow - 1));
                }
                
                if(upper >= 0) {
                    count[pow] += Math.min((resb - resa + 1), (upper + 1));
                    count[pow] %= 2;
                    if(upper > 0) {
                        while(true) {
                            if((long)Math.pow(2, pow) <= upper)break;
                            pow--;
                        }
                        if(resa - pow_num >= 0) {
                            q.add((resa - pow_num)+","+upper+","+pow);
                        }else {
                            q.add(1+","+upper+","+pow);
                        }
                    }
                }
            }
            long res_num = 0;
            for(int i = count.length - 1 ; i >= 0 ; i--) {
                if(count[i] == 1)res_num += Math.pow(2, i);
            }
            System.out.println(res_num);
        }
    }
}
