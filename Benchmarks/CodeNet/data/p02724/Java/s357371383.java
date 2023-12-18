import java.util.*;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
long n=sc.nextLong();
long s=0;
long q=n/500;
s=q*1000;
long z=n%500;
long f=(z/5);
s=s+(f*5);
System.out.println(s);
}

}