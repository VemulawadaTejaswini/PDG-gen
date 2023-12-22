import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			BigInteger sum=BigInteger.ZERO;
			BigInteger add=BigInteger.ZERO;
			for(int i=1;i<n;i++){
				add=add.add(BigInteger.valueOf(a[i-1]));
				sum=sum.add(add);
			}
			System.out.println(sum);
		}
	}
}