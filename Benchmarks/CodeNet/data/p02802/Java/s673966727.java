import java.util.*;
import static java.lang.System.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] P = new int[M];
        String[] S = new String[M];
        int total = 0;
        int wa = 0;
        int ac = 0;
        int nanban = 0;
        int kari_wa = 0;
        boolean saigo = false;
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            S[i] = sc.next();
        }
        for (int i = 0; i < M; i++) {

            if (S[i].equals("AC")) {
                if (i == 0) {
                    ac += 1;
                    saigo = false;

                } else if (S[i] != S[i - 1] && P[i] != P[i - 1]) {
                    ac += 1;
                    saigo = false;
                } else {

                
                }
                
            } else {//WAだったら
                wa += 1;
                saigo = true;

            }
        }
        if (saigo) {
            wa -= P[M] - nanban;
        }
        out.println(ac);
        out.print(wa);
        
        
       
    }
}