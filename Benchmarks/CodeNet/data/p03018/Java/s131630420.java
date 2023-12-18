import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		char a[]=new char[s.length()];
		a[0]=s.charAt(0);
		if(s.length()>1)
			a[1]=s.charAt(1);
		int z=2,y=0,ans=0;
		while(z<s.length()){
			a[z]=s.charAt(z);
			if(a[z-2]=='A'&&a[z-1]=='B'&&a[z]=='C'){
				y=z-3;a[z-2]='B';a[z-1]='C';a[z]='A';ans++;
				while(y>=0){
					if(a[y]=='A'){
						a[y]='B';a[y+1]='C';a[y+2]='A';
						ans++;
					}
					else
						break;
					y--;
				}
			}
			z++;
		}
		System.out.println(ans);
	}
}