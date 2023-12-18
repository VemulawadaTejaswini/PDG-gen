import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int S[]=new int[(int)Math.pow(2,N)];
		boolean fin=false;
		for(int i=0;i<(int)Math.pow(2,N);i++){
			S[i]=stdIn.nextInt();
		}

		Arrays.sort(S);
		int z=(int)Math.pow(2,N)-1;
		int x=0;
		int y=1;
		while(z-y-x>=0){
			if(S[z-y-x]>=S[z]){
				fin=true;
				break;
			}
			x++;
			z--;
		}
		if(fin)
		System.out.println("No");
		else
			System.out.println("Yes");
	}
}