//TLEのあほ!ばか!くず!ごみ!
import java.util.Scanner;
public class Main{
	
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
		String a=scan.next();
		int count=0;
		for(int i=0;i<a.length()-1;i++) {
			char ch1=a.charAt(i);
			char ch2=a.charAt(i+1);
			if(ch1=='0'&&ch2=='1'||ch1=='1'&&ch2=='0') {
				count+=2;
				a=a.substring(0,i)+a.substring(i+2,a.length());
				if(i!=0) {
					i-=2;
				}
				if(i==0) {
					i-=1;
				}
			}
		}
		System.out.println(count);
	}
}