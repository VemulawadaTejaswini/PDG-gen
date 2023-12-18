import java.util.Scanner;

final class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        long n, a, b, c, d, e;
        long [] p = new long [6];
        long minP = 0;
        int minPC = 0;
        long time = 0;

        n = stdIn.nextLong();
        a = stdIn.nextLong();
        b = stdIn.nextLong();
        c = stdIn.nextLong();
        d = stdIn.nextLong();
        e = stdIn.nextLong();
        p[0] = n;

        minP = a;
        if(b<minP){
            minP = b;
            minPC = 1;
        }
        if(c<minP){
            minP = c;
            minPC = 2;
        }
        if(d<minP){
            minP = d;
            minPC = 3;
        }
        if(e<minP){
            minP = e;
            minPC = 4;
        }

        time = 5 + n/minP;

        System.out.print(time);
    }
}