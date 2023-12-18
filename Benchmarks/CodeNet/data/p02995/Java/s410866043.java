import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		int ac=a/c;
		int bc=a/c;
		int ad=a/d;
		int bd=a/d;
		int acd=a/(c*d);
		int bcd=b/(c*d);
		
		int count=0;
		if(a%c!=0){
			ac;
		}
		if(b%c!=0){
			bc++;
		}
		if(a%d!=0){
			ad++;
		}
		if(b%d!=0){
			bd++;
		}
		if(a%(c*d)!=0){
			acd++;
		}
		if(b%(c*d)!=0){
			bcd++;
		}
		
		System.out.println(bc-ac+bd-ad-(bcd-acd));
		
		
	}
}