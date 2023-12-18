import java.io.*;
import java.util.*;

    public class Main extends PrintWriter {
        Main() { super(System.out, true); }
        Scanner sc = new Scanner(System.in);
        public static void main(String[] $) {
            Main o = new Main(); o.main(); o.flush();
        }

        void main(){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long K = sc.nextLong();
            for(;K > 1;K--){
                if(A > 0){
                    A--;
                }
                else if(B > 0){
                    B--;
                }
                else{

                }
            }
            print(A + " "  + B);
    }
}
