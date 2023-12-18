import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		String s="";
		int S[]=new int[5];
		int z=0,y=0,x=0;
		long ans=0;
		while(z<N){
			s=stdIn.next();
			s=s.substring(0,1);
			if(s.equals("M"))
				S[0]++;
			if(s.equals("A"))
				S[1]++;
			if(s.equals("R"))
				S[2]++;
			if(s.equals("C"))
				S[3]++;
			if(s.equals("H"))
				S[4]++;
			z++;
		}z=0;
		while(z<5){
			y=z+1;
			while(y<5){
				x=y+1;
				while(x<5){
					ans+=S[z]*S[y]*S[x];
					x++;
				}
				x=0;y++;
			}
			y=0;z++;
		}
		System.out.println(ans);
	}
}