import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long k=s.nextLong();
        long ss=s.nextLong();
        if(ss<k){
            System.out.println((long)Math.floor((long)((long)ss*(long)n/(long)k) ));
        }
        else{
            long a1= (long) Math.floor( (long)((long)(k-1)*(long)n/(long)k) );
            long a2=(long) ((long)Math.floor( (long)((long)(k)*(long)n/(long)k))-(long)n);
            if(a1>a2 ) {
                System.out.println(a1);
            }else{
                System.out.println(a2);
            }
        }}}