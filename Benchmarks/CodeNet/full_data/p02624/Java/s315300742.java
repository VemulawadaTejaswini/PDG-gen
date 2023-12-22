
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
   long N=scan.nextLong();
   long p=N*(N+1)/2;
 for(int i=2;i<=N;i++){
     p=p+i*((long)Math.pow(i,N/i)-1)/(i-1);


 }
System.out.println(p);
    }
}
