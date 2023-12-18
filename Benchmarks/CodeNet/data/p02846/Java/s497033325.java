import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Long T1 = sc.nextLong();
        Long T2 = sc.nextLong();
        Long A1 = sc.nextLong();
        Long A2 = sc.nextLong();
        Long B1 = sc.nextLong();
        Long B2 = sc.nextLong();
        int res = 0;
        Long A = 0L;
        Long B = 0L;
        
        if(T1 * A1 + T2 * A2 == T1 * B1 + T2 * B2){
            res = -1;
        }
        
        if(res == -1){
      	    System.out.println("infinity");
        }else{
            boolean stop = false;
            while(!stop){
                stop = true;
                boolean go = (A > B);
                A += T1 * A1;
                B += T1 * B1;
                if(go != (A > B)){
                    stop = false;
                    res++;
                }
                go = (A > B); 
                A += T2 * A2;
                B += T2 * B2;
                if(go != (A > B)){
                    stop = false;
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
