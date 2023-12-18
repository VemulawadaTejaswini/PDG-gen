import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static int fun(BigInteger a){
        String b=a+"";
        int v=Integer.parseInt(b.charAt(b.length()-1)+"");
        BigInteger five=new BigInteger("5");
        if(a.mod(BigInteger.TEN).compareTo(five)<=0)
            return v;
        else
            return 10-v;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        BigInteger a=sc.nextBigInteger();
        BigInteger five=new BigInteger("5");
        BigInteger nine=new BigInteger("9");
        int count=0;
        while(a!=BigInteger.ZERO){
            count+=Main.fun(a);
            if(a.mod(BigInteger.TEN).compareTo(five)>0) {
                if(a.mod(BigInteger.TEN)==nine)
                    count++;
                a=a.divide(BigInteger.TEN);
                a=a.add(BigInteger.ONE);
            }else if(a.mod(BigInteger.TEN).compareTo(five)<0)
                a=a.divide(BigInteger.TEN);
            else{
                if(a.divide(BigInteger.TEN).mod(BigInteger.TEN).compareTo(five)>=0){
                    if(a.mod(BigInteger.TEN)==nine)
                        count++;
                    a=a.divide(BigInteger.TEN);
                    a=a.add(BigInteger.ONE);
                }else{
                    a=a.divide(BigInteger.TEN);
                }
            }

        }
        System.out.println(count);

    }
}
