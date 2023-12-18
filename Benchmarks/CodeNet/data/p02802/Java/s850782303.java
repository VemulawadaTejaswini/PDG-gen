    import java.util.*;


    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a[][] = new int[m][2];
            if(m == 0){
                System.out.println("0 0");
            }else{
                for(int i=0;i<m;i++){
                    a[i][0] = sc.nextInt();
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
        static String ret(int m, int[][] a){
            Map<Integer, Integer> b = new HashMap<>();
            int ac = 0;
            int wc = 0;
            for(int i=0;i<m;i++) {
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
            String ret = Integer.toString(ac) + " " + Integer.toString(wc);
            return ret;
        }
    }