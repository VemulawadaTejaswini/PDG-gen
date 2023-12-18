import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.Buffer;
import java.util.*;

class Main {
    public static void main(String[] args){
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            String[] ss=br.readLine().split(" ");
            int A=Integer.parseInt(ss[0]);
            int B=Integer.parseInt(ss[1]);
            int d=A/t;
            int d2=B/t;
            if(d2>d || A%t==0 || B%t==0){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }

        } catch (Exception e) {
            System.out.println("kkkk "+ e.getMessage());
        }
    }
    static int modInverse(int x,int m){
        return power(x,m-2,m);
    }
    static int power(int x, int y, int m)
    {
        if (y == 0)
            return 1;

        long p = power(x, y / 2, m) % m;
        p = (p * p) % m;

        return (int)((y%2==0)? p : (x*p)%m);
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}