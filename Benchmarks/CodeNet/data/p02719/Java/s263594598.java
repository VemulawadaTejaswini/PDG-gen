import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long n=scan.nextLong();
long k=scan.nextLong();

long a=n/k;
long b=n%k;
long c=Math.min(b,k-b);


System.out.println(c);


}
}
