import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="AMBIGUOUS";
		int s1=Integer.parseInt(s.substring(0, 2));
		int s2=Integer.parseInt(s.substring(2,4));
		if(s1>12) {
			ans="YYMM";
			if(s2>12) {
				ans="NA";
			}
		}
		if(s2>12) {
			ans="MMYY";
		}
		if(s1<1||s2<1)ans="NA";
		System.out.println(ans);
	}
}