import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] head = br.readLine().split(" ");
       String[] pdata = br.readLine().split(" ");
       String[] qdata = br.readLine().split(" ");
       String[] rdata = br.readLine().split(" ");
       br.close();
       long sum = 0;
       int x = Integer.parseInt(head[0]);
       int y = Integer.parseInt(head[1]);
       int a = Integer.parseInt(head[2]);
       int b = Integer.parseInt(head[3]);
       int c = Integer.parseInt(head[4]);
       
       long[] p = new long[a];
       for(int i = 0; i < a; i++){
           p[i] = Long.parseLong(pdata[i]);
       }

       long[] q = new long[b];
       for(int i = 0; i < b; i++){
           q[i] = Long.parseLong(qdata[i]);
       }

       long[] r = new long[c];
       for(int i = 0; i < c; i++){
           r[i] = Long.parseLong(rdata[i]);
       }

       int pidx = 0;
       int qidx = 0;
       int ridx = r.length - 1;

       Arrays.sort(p);
       Arrays.sort(q);
       Arrays.sort(r);
       p = Arrays.copyOfRange(p, a - x, a);
       q = Arrays.copyOfRange(q, b - y, b);

       sum += Arrays.stream(p).sum();
       sum += Arrays.stream(q).sum();
       
       while(ridx >= 0){
           if(pidx >= p.length && qidx >= q.length) {
               break;
           }
           long p_val = (pidx < p.length) ? p[pidx] : Long.MAX_VALUE;
           long q_val = (qidx < q.length) ? q[qidx] : Long.MAX_VALUE;
           if(p_val < q_val){
               if(r[ridx] > p_val){
                   sum = sum - p[pidx] + r[ridx];
                   ridx--;
                   pidx++;
               } else {
                   break;
               }
           } else {
            if(r[ridx] > q_val){
                sum = sum - q[qidx] + r[ridx];
                ridx--;
                qidx++;
            } else {
                break;
            }
           }
       }
       System.out.println(sum);
   } 
}