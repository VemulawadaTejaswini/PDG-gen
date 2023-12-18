import java.io.*;
import java.util.*;


class Main{
    public long luca(int n){
        long l = 2;
        long ln = 1;
        for(int i = 1; i < n;i++){
            long tmp = l;
            l = ln;
            ln = tmp + ln;
            // System.out.println(ln);
        }
        return ln;
    }

    public void run() throws Exception{
        Scanner cin = new Scanner(System.in);
        int arg = cin.nextInt();
        System.out.println(luca(arg));
    }

    public static void main(String[] args) throws Exception{
        new Main().run();
    }
}
