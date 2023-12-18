import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List1 = sc.next().toCharArray();
		List2 = List1.clone();
		System.out.println(DP(N-1,N-1));
	}
	public static char[] List1;
	public static char[] List2;
	public static int DP(int x,int y){
		if(x == -1|y == -1){
			return 0;
		}
		else{
			if(List1[x]==List2[y]&x!=y){return DP(x-1,y-1)+1;}
			else{return Math.max(DP(x-1,y),DP(x,y-1));}

		}
	}
}
