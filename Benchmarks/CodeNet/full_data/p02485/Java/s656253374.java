import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,S=0;
		for(;;){
		String a =sc.next();
		if(a=="0"){
				break;
		}
		int n=a.length();
		for(i=0;i<n;i++){
			char ch=a.charAt(i);
			S = S + Integer.parseInt("" + ch);
		}
		System.out.printf("%d\n",S);
		}
	}
}