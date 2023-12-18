import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		String c=s.next();
		int max=0;
		for(int i=1;i<c.length();++i)
			if(c.charAt(i)!=c.charAt(i-1))
				max=Math.max(max,Math.max(i,c.length()-i));
		System.out.println(max);
	}
}
