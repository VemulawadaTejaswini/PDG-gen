import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		int M = Integer.parseInt(in.next());
		
		System.out.println((int)(((N-M)*100+M*1900)*Math.pow(2,M)));
	}
}