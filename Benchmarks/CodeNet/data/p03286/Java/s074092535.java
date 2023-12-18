import java.util.Scanner;
class Main{
	public static void main(String[]$){
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),a=n;
	String s="";
	for(;n!=0;n/=-2) {
		if(n%2!=0) {
			n--;s='1'+s;
		}else s='0'+s;
	}
	System.out.println(a==0?0:s);
	}
}