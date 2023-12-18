import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		List<String> S = new ArrayList<String>();
		int z=0,y=0,x=0,w=1;
		String a="";
		while(z<N){
			a=stdIn.next();
			y=stdIn.nextInt();
			a+=(100-y)+"."+z;
			S.add(a);
			z++;
		}z=0;
		Collections.sort(S);
		while(z<N){
			a=S.get(z);
			while(x<a.length()){
				if(a.charAt(x)=='.')
					break;
				x++;
			}
			a=a.substring(x+1,a.length());
			System.out.println(Integer.valueOf(a)+1);
			x=0;
			z++;
		}
	}
}