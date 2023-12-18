import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		HashMap<Integer,Integer>A=new HashMap<Integer,Integer>();
		int N=stdIn.nextInt();
		int z=0,y=0,x=0,ans=0;
		while(z<N){
			y=stdIn.nextInt();
			if(A.containsKey(y))
				x=A.get(y);
			A.put(y,x+1);
			x=0;
			z++;
		}z=1;
		while(z<=1000000000){
			if(A.containsKey(z)){
				x=A.get(z);
				if(x!=0&&x!=z)
					if(x>z)
						ans+=x-z;
					else
						ans+=x;
			}
			z++;
		}
		System.out.println(ans);
	}
}