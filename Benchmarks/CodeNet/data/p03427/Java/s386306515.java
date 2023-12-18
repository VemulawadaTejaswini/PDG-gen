import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner input=new Scanner (System.in);
	long a=input.nextLong();
	long b=a;
	int count=0;
	long sum1=0;
	long sum=0;
	while(a>0) {
		if(a<10) {
			sum1= a;
		}
		a/=10;
		count++;
	}
	sum=(count-1)*9+sum1-1;
	System.out.println(sum);
}
}
