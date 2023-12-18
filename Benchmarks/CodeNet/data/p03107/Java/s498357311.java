import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		sc.close();
		int num=proc(s,0)*2;
		System.out.println(num);
	}

	private static int proc(String str,int num){
		int n1=num,n2=num,n3=num,n4=num;
		String a=str.replace("01", "");
		String b=str.replace("10", "");
		String c=replaceLast(str,"01","");
		String d=replaceLast(str,"10","");
		int ii=str.length();
		int jj=a.length();
		int kk=b.length();
		int ll=c.length();
		int mm=d.length();
		if(ii>jj)n1=proc(a,num+1);
		if(ii>kk)n2=proc(b,num+1);
		if(ii>ll)n3=proc(c,num+1);
		if(ii>mm)n4=proc(d,num+1);
		return Math.max(Math.max(Math.max(n1, n2),n3),n4);
	}

	public static String replaceLast(String text, String regex, String rep) {
		return text.replaceFirst("(?s)"+regex+"(?!.*?"+regex+")", rep);
	}
}