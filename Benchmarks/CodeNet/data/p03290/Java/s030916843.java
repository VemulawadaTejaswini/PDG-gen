import java.util.*;

class Abc104c
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        long G = sc.nextLong() / 100;

        int[] d = new int[D];
        long[] c = new long[D];
        long[] comp = new long[D];
        long[] avr = new long[D];

        for(int i = 0; i < D; i++){
            d[i] = sc.nextInt();
            c[i] = sc.nextInt() / 100;
            comp[i] = d[i] * i  + c[i];
            avr[i] = comp[i] / d[i] + 1;
        }

        long comp_count = 0;
        int i = D - 1;
        int count = 0;
        while(comp_count < G){
            comp_count += comp[i];
            count += d[i];
            i--;
        }
        count += ( G - count ) / d[i] ;

        System.out.println(count);
    }
}