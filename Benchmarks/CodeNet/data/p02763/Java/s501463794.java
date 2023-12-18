import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        List<BIT> cnts = new ArrayList<>();
        for(int i=0;i<26;i++){
            cnts.add(new BIT(N+10));
        }
        for(int i=0;i<N;i++){
            int ind = S.charAt(i)-'a';
            cnts.get(ind).addTo(i+1, 1);
        }
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            int qt = sc.nextInt();
            if(qt == 1){
                int iq=sc.nextInt()-1;
                String cq=sc.next();
                int toc=cq.charAt(0)-'a';
                int fromc = S.charAt(iq)-'a';
                if(fromc != toc) {
                    cnts.get(fromc).addTo(iq + 1, -1);
                    cnts.get(toc).addTo(iq + 1, 1);
                }
            }else{
                int lq=sc.nextInt();
                int rq=sc.nextInt();
                long res = cnts.stream().filter(bit->
                        bit.sumTo(rq)-bit.sumTo(lq-1)>0
                ).count();
                System.out.println(res);
            }
        }


    }
    private static class BIT{
        long[] vals;
        int len;
        BIT(int n){
            len = n;
            vals = new long[len+1];
            Arrays.fill(vals, 0L);
        }
        public void addTo(int ind, long val){
            while(ind <= len){
                vals[ind] += val;
                ind += btmBit(ind);
            }
        }

        public long sumTo(int ind){
            long sum = 0;
            while(ind > 0){
                sum += vals[ind];
                ind -= btmBit(ind);
            }
            return sum;
        }

        private static int btmBit(int a){
            return a&(-a);
        }

        @Override
        public String toString(){
            StringBuilder bld = new StringBuilder();
            for(int i=0;i<len+1;i++){
                bld.append(sumTo(i));
            }
            return bld.toString();
        }
    }
}
