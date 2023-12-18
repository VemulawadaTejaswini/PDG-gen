import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		long k=stdIn.nextLong();
		int S[]=new int[s.length()];
		int z=0;
		while(z<s.length()){
			S[z]=Integer.valueOf(s.substring(z,z+1));
			if(S[z]==1&&z==k)
				break;
			else
				if(S[z]!=1)
					break;
			z++;
		}
		System.out.println(S[z]);
	}
}