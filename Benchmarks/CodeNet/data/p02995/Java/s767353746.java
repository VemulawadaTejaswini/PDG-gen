import java.util.*;

public class Main {


    public static long lcm(long m, long n){
        return m*n/gcd(m,n);
    }

    public static long gcd(long c, long d){
        if (c<d){return gcd(d,c);}
        if(d==0){return c;}
        return gcd(d, c%d);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

//        long num[] = new long[b-a+1];
//        for (long i=0; i<b-a+1; i++){
//            num[i] = a+i;
//        }

        long count=0;

        long total = b-a+1;

        long c_count=0;
        long d_count=0;
        long cd_count=0;


        if (((c-(a%c))+b%c)>c){
            c_count += (b-a)/c-1;
        }else{
            c_count += (b-a)/c;
        }


        if (((d-(a%d))+b%d)>d){
            d_count += (b-a)/d-1;
        }else{
            d_count += (b-a)/d;
        }




        if (((lcm(c,d)-(a%lcm(c,d))+b%lcm(c,d))>lcm(c,d))){
            cd_count += (b-a)/lcm(c,d)-1;
        }else{
            cd_count += (b-a)/lcm(c,d);
        }

        count = (b-a+1)-c_count-d_count+cd_count;

        System.out.println(count);

    }
}

