import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String s=stdIn.next();
		String t=stdIn.next();
		int z=0,y=0,x=0,ans=0;
		while(z<N){
			while(x<N){
				if(s.charAt(x)==t.charAt(y))
					ans++;
				else
					break;
				x++;y++;
			}
			y=0;
			z++;
			x=z;
			if(ans!=0)
				break;
		}
		System.out.println(N*2-ans);
	}

}