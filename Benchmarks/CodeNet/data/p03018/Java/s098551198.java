import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		char a[]=new char[s.length()];
		a[0]=s.charAt(0);
		if(s.length()>1){
			a[1]=s.charAt(1);
		}
		int z=2,y=0,ans=0,A=0;
		while(z<s.length()){
			a[z]=s.charAt(z);
			if(a[z-2]=='A')
				A++;
			else
				A=0;
			if(a[z-2]=='A'&&a[z-1]=='B'&&a[z]=='C'){
				y=z-3;a[z-2]='B';a[z-1]='C';a[z]='A';ans++;
				a[z-2-A+1]='B';
				a[z-1-A+1]='C';
				if((z-2)-(z-2-A+1)==1)
					a[z-1]='A';
				if((z-2)-(z-2-A+1)>1){
					a[z-1]='A';a[z-2]='A';
				}
				ans+=(z-2)-(z-2-A+1);
			}
			z++;
		}
		System.out.println(ans);
	}
}