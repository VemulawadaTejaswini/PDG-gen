import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String s[]=new String[N];
		int z=0,y=0,A=0,B=0,ans=0;
		while(z<N){
			s[z]=stdIn.next();
			if(s[z].charAt(s[z].length()-1)=='A')
				A++;
			if(s[z].charAt(0)=='B')
				B++;
			while(y<s[z].length()-1){
				if(s[z].charAt(y)=='A')
					if(s[z].charAt(y+1)=='B'){
						ans++;y++;
					}
				y++;
			}
			y=0;
			z++;
		}
		if(A<=B&&A<N)
			ans+=A;
		else
			if(A>B&&B<N)
				ans+=B;
			else
				ans+=N-1;
		System.out.println(ans);
	}
}