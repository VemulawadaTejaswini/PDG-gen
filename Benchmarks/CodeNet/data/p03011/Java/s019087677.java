import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            sc.close();

            System.out.println(Math.min(Math.min(P+Q,Q+R),R+P));
    }
}

