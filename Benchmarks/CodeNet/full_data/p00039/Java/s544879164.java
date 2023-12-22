import java.util.*;
public class Main {
	static String input = new String();
	static char[] hyou = {'I','V','X','L','C','D','M'};
	static int[] hyou2 = {1,5,10,50,100,500,1000};
	static int search(char a){
		for(int i=0;i<7;i++)if(a==hyou[i])return hyou2[i];
		return 0;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			input = in.next();
			int result = 0;int memo=0;
			memo=search(input.charAt(0));
			result = memo;
			for(int s=1;s<input.length();s++){
				int k=search(input.charAt(s));
				if(memo<k)result-=k;
				else result+=k;
				memo=k;
			}
			System.out.println(Math.abs(result));
		}
	}
}