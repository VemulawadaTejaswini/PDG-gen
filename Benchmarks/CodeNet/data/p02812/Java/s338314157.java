import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
    Main() { super(System.out, true); }
    Scanner sc = new Scanner(System.in);
    public static void main(String[] $) {
        Main o = new Main(); o.main(); o.flush();
    }

    void main(){
        int N = sc.nextInt();
        if(N > 50){
            N = 50;
        }
        String S = sc.next();
        int Y = 0;
        int U = 0;
        for(int i = 0; i < N;i++){
            if(Y == 0){
                if(S.charAt(i) == 'A'){
                    Y = 1;
                }
            }
            else if(Y == 1){
                if(S.charAt(i) == 'B'){
                    Y = 2;
                }
                else if(S.charAt(i) == 'A'){
                    Y = 1;
                }
                else{
                    Y = 0;
                }
            }
            else if(Y == 2){
                if(S.charAt(i) == 'C'){
                    Y = 0;
                    U++;
                }
                else if(S.charAt(i) == 'C'){
                    Y = 1;
                }
                else{
                    Y = 0;
                }
            }
        }
        print(U);
    }
}
