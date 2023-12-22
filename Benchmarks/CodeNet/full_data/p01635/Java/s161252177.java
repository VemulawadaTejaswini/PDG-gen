import java.util.*;
import java.math.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		String str=s.next();
		int ad[]=new int[10];
		for(int i=2;i<str.length();i+=4){
			ad[(int)(str.charAt(i)-'0')]++;
		}
		BigInteger bi=new BigInteger("0");
		for(int i=0;i<10;i++){
			BigInteger p=new BigInteger("1");
			for(int j=0;j<i;j++){
				p=p.multiply(new BigInteger(""+a));
			}
			bi=bi.add(p.multiply(new BigInteger(""+ad[i])));
		}
		bi=bi.multiply(new BigInteger(""+b));
		if(bi.compareTo(new BigInteger("1000000000"))<=0){
			System.out.println(bi.toString());
		}else System.out.println("TLE");
	}
}