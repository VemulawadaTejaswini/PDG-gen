import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                long[] a = new long[n];
                long zentai = 0;
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextLong();
                        zentai += a[i];
                }
                sc.close();
                long aaa = zentai;
                long bbb = 0;
                long ccc = zentai;
                for(int i = 0 ; i < n ; i++){
                        aaa -= a[i];
                        bbb += a[i];
                        ccc = Math.min(ccc , Math.abs(aaa - bbb));
                }
                System.out.println(ccc);
        }
}