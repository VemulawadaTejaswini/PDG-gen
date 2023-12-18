import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();
		int num=proc(s,0);
		System.out.println(num);
	}

	private static int proc(String str,int num){
		int n1=num,n2=num,n3=num,n4=num;
		String a=str.replace("00", "");
		String b=str.replace("11", "");
		String c=replaceLast(str,"00","");
		String d=replaceLast(str,"11","");
		int ii=str.length();
		int jj=a.length();
		int kk=b.length();
		int ll=c.length();
		int mm=d.length();
		if(ii>jj)n1=proc(a,num+2);
		if(ii>kk)n2=proc(b,num+2);
		if(ii>ll)n3=proc(c,num+2);
		if(ii>mm)n4=proc(d,num+2);
		return Math.max(Math.max(Math.max(n1, n2),n3),n4);
	}

	public static String replaceLast(String text, String regex, String rep) {
		return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", rep);
	}
}