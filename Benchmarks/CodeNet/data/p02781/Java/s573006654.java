import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        BigInteger ten=new BigInteger("10");
        BigInteger nine=new BigInteger("9");
        BigInteger t=new BigInteger("111");
            BigInteger a = sc.nextBigInteger();
            String r=a+"";
            int b=sc.nextInt();
            if(b==1) {
                if (a.compareTo(ten) == -1)
                    System.out.println(a);
                else
                    System.out.println(a.divide(ten).add(nine));
            }
           if(b==2){
               if(a.compareTo(ten.add(BigInteger.ONE))==-1)
                   System.out.println("0");
               else {
                   long p = (Integer.parseInt(r.charAt(0) + "") - 1) * 9 * (r.length() - 1);
                   p += (r.length() - 2) * (r.length() - 1) / 2 * 9 * 9;
                   p += (r.length() - 2) * 9;
                   p += Integer.parseInt(r.charAt(1) + "");
                   System.out.println(p);
               }
           }
           if(b==3) {
               if (a.compareTo(t) == -1)
                   System.out.println("0");
               else {
                   long q = 0;
                   long v = (r.length() - 1) * (r.length() - 2) * (r.length() - 3) / 6 * 9 * 9 * 9;
                   v += 9 * 9 * (Integer.parseInt(r.charAt(0) + "") - 1) * (r.length() - 1) * (r.length() - 2) / 2;
                   r = r.substring(1);
                   long p = (Integer.parseInt(r.charAt(0) + "") - 1) * 9 * (r.length() - 1);
                   p += (r.length() - 2) * (r.length() - 1) / 2 * 9 * 9;
                   p += (r.length() - 2) * 9;
                   p += Integer.parseInt(r.charAt(1) + "");
                   v += p;
                   System.out.println(v);
               }
           }
    }
}
