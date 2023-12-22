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
            String[] ss=br.readLine().split(" ");
            int a=Integer.parseInt(ss[0]);
            int b=Integer.parseInt(ss[1]);
            int c=Integer.parseInt(ss[2]);
            int d=Integer.parseInt(ss[3]);
            if(a+b>=c+d){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        } catch (Exception e) {
            System.out.println("kkkk "+ e.getMessage());
        }
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