    import java.util.*;


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a[][] = new int[m][2];
            if(m == 0){
                System.out.println("0 0");
            }else{
                for(long i=0;i<m;i++){
                    a[i][0] = sc.nextLong();
                    String wk = sc.next();
                    if(wk.equals("AC")){
                        a[i][1] = 0;
                    }else{
                        a[i][1] = 1;
                    }
                }
                System.out.println(ret(m,a));
            }
        }
        static String ret(Long m, Long[][] a){
            Map<Long, Long> b = new HashMap<>();
            Long ac = 0;
            Long wc = 0;
            for(Long i=0;i<m;i++) {
                if(b.containsKey(a[i][0])){
                    if(b.get(a[i][0]) == 1){
                        if(a[i][1] == 0){
                            ac ++;
                            b.put(a[i][0],a[i][1]);
                        }else{
                            wc ++;
                        }
                    }
                }else{
                    if(a[i][1] == 0){
                        ac ++;
                    }else{
                        wc ++;
                    }
                    b.put(a[i][0],a[i][1]);
                }
            }
            String ret = Long.toString(ac) + " " + Long.toString(wc);
            return ret;
        }
    }