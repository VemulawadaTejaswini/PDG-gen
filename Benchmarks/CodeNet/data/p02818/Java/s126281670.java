import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            int A = Integer.parseInt(sc.next());
            int B = Integer.parseInt(sc.next());
            int K = Integer.parseInt(sc.next());
            for(;K > 0;K--){
                if(A > B){
                    A--;
                }
                else if(B > A){
                    B--;
                }
                else{
                    break;
                }
            }
    }
}
