import java.util.*;
public class ABC053_C {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong(),sum=0;
		sum=x/11*2;
		if(x%11>6)sum+=2;
		else sum+=1;
		System.out.println(sum);
	}
}