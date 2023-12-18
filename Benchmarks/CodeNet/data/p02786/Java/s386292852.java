import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
    static long battle(long H){
        if(H<=0) return 0;
        if(H==1) return 1;
        return 1 + 2 * battle(H/2);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        System.out.println(battle(H));
    }
}
