import java.util.*;
 
class Prg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t;
        for(long i = 1;; i++){
            t = sc.nextInt();
            if(t == 0) break;
            System.out.println("Case " + i + ": " + t);
        }
    }
}