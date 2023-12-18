import java.util.Scanner;
class Main{
	public static void main(String[]$){
		Scanner sc=new Scanner(System.in);
	long n=sc.nextLong();
	String s="";
	for(;n!=0;n/=-2) {
		if(n%2!=0) { //奇数
			n--;s='1'+s;
		}else s='0'+s; //偶数
	}
	System.out.println(s);
	}
}