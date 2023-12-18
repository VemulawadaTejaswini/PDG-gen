import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long a=sc.nextLong();
		long kaisu=0L;

		kaisu=a/11*2;
		a=a%11;

		if(a==0) {
			//
		}
		else if(a<=5 && a>=1) {
			kaisu++;
		}
		else if(a>=6){
			kaisu+=2;
		}
		System.out.println(kaisu);
	}
}