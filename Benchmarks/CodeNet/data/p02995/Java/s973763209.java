import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();
//A以上  B以下の整数のうち、CでもDでも割り切れないものの個数を出力せよ。

//System.out.println(ans(b,c,d));
//System.out.println(ans(a-1,c,d));
System.out.println(ans(b,c,d)-ans(a-1,c,d));

	}

static public long ans(long a,long c,long d){
	long han=a;

	if(Math.log10(d)+Math.log10(c)-Math.log10(gcd(c,d))>17){
		han=han-(han/c)-(han/d)+((han/c)/d);

		return han;
	}else{
	han=han-(han/c)-(han/d)+(han/(lcm(c,d)));
	return han;
	}
}
static long gcd (long a, long b) {
	long temp;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return b;
}

static long lcm (long a, long b) {
	long temp;
	long c = a;
	c *= b;
	while((temp = a%b)!=0) {
		a = b;
		b = temp;
	}
	return (long)(c/b);
}
}
