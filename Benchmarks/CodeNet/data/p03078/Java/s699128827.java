    import java.util.*;
         
    public class Main {
        
        private List<Long> tasteList;
        private int k = 0;
         
        public static void main(String[] args) {
            Main m = new Main();
            m.read();
            m.exec();
        }
         
        private void read() {
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            k = scan.nextInt();
            List<Long> xList = new ArrayList<Long>();
            for (int i = 0; i < x; i++) {
                xList.add(scan.nextLong());
            }
            List<Long> yList = new ArrayList<Long>();
            for (int i = 0; i < y; i++) {
                yList.add(scan.nextLong());
            }
            List<Long> zList = new ArrayList<Long>();
            for (int i = 0; i < z; i++) {
                zList.add(scan.nextLong());
            }
            tasteList = new ArrayList<Long>();
            for (long l : xList) {
                for (long m : yList) {
                    for (long n : zList) {
                        tasteList.add(l + m + n);
                    }
                }
            }
        }
         
        private void exec() {
            Collections.sort(tasteList);
            for (int i = 1; i <= k; i++) {
                 System.out.println(String.valueOf(tasteList.get(tasteList.sise() - i)));
            }
        }
    }