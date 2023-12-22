import java.util.Scanner;
import java.math.BigDecimal;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a[] = new long[2];
        long c[] = new long[2];
        a[0] = sc.nextLong();
        a[1] = sc.nextLong();
        c[0] = sc.nextLong();
        c[1] = sc.nextLong();

        long max =  Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<c.length;j++){
              //System.out.println(x*y);
                if(a[i]*c[j]>max) max = a[i]*c[j];
            }
        }
        System.out.print(max);
    }
}
