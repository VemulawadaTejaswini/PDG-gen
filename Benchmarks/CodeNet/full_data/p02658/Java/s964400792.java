import java.util.Scanner;
import java.math.BigInteger;
public class Main
{
    public static void main(String args[]){
     Scanner sc =   new Scanner(System.in);
     int a = sc.nextInt();
     long[] b = new long[a];
     long c = 1;
        for(int i = 0; i<a;i++){
            b[i]=sc.nextLong();
    }
    for(int i=0; i<b.length;i++){
        c=b[i]*c;
    }
    System.out.println(c);
    }
  }