import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int N=S.length();
		String h="";
		int z=0,cou=0,min=0;
		while(z<N){
			if(z%2==0)
				h="0";
			else
				h="1";
			if(S.substring(z,z+1).equals(h)){
				
			}
			else
				cou++;
			z++;
		}min=cou;z=0;cou=0;
		while(z<N){
			if(z%2==0)
				h="1";
			else
				h="0";
			if(S.substring(z,z+1).equals(h)){
				
			}
			else
				cou++;
			z++;
		}
		if(cou<=min)
			System.out.println(cou);
		else
			System.out.println(min);
	}
}