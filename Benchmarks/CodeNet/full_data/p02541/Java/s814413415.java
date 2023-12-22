import java.math.BigInteger; 
import java.util.Scanner; 
class Name
{
    public static void main(String[] args)
    {
        long a;
        String c;
        Scanner sc= new Scanner(System.in);
        a=sc.nextLong();
        for(long i=1;i<(long)a;i++){
            BigInteger f=new BigInteger(Long.toString(i));
            f=f.multiply(BigInteger.valueOf(i+1));
            BigInteger[] d=f.divideAndRemainder(BigInteger.valueOf(2));
            BigInteger q=d[0];
            d=q.divideAndRemainder(BigInteger.valueOf(a));

            if(d[1]==BigInteger.valueOf(0)){
                System.out.println(i);
                break;
            }

        }

    }
}