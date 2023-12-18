import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		String a="";
		String e="";
		String f="";
		int z=0,s1=s.length();
		while(z<s1){
			a=s.substring(z,z+1);
			if(a.equals("0")){
				f=e;
				e+="0";
			}
			if(a.equals("1")){
				f=e;
				e+="1";
			}
			if(a.equals("B")){
				e=f;
			}
			z++;
		}
		System.out.println(e);
	}
}