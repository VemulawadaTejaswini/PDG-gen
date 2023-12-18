import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans="AMBIGUOUS";
		int s1=Integer.parseInt(s.substring(0, 2));
		int s2=Integer.parseInt(s.substring(2,4));
		boolean Mflag1=true;
		boolean Mflag2=true;
		if(s1<1)Mflag1=false;
		if(s2<1)Mflag2=false;
		if(s1>12)Mflag1=false;
		if(s2>12)Mflag2=false;
		if(Mflag1==false&&Mflag2==false)ans="NA";
		if(Mflag1==true&&Mflag2==false)ans="MMYY";
		if(Mflag1==false&&Mflag2==true)ans="YYMM";
		System.out.println(ans);
	}
}
