import java.math.*;
class Main{
	public static void main(String[]z){
		BigInteger b=BigInteger.ONE;
		int i=2,n=new java.util.Scanner(System.in).nextInt();
		for(;i<1501;i++)b=b.multiply(new BigInteger(String.valueOf(i)));
		for(System.out.println(b.add(new BigInteger("2")));n>0;n--)System.out.println(i+2);
	}
}