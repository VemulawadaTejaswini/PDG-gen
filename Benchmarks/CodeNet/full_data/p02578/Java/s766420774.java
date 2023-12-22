import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scan = new Scanner(System.in);
int        N = scan.nextInt();
long A[]=new long [N];
long p=0;
for(int i=0;i<N;i++){
    A[i]=scan.nextLong();
    if(i>0){if(A[i]<A[i-1]){p=p+A[i-1]-A[i];
    A[i]=A[i-1];}}

}
System.out.println(p);
    }
}
