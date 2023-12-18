import java.util.Map;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
long A= scan.nextLong();
        long B= scan.nextLong();
        long C= scan.nextLong();
        long K= scan.nextLong();

long N;
if (K<=A){N=K;}
else if(K<=A+B){N=A;}
else {N=A-K+A+B;}
System.out.println(N);




    }

       }

