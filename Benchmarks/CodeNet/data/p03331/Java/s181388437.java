import java.util.*;
public class Main {
	public static void main(String[] args){
	
	//入力
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		String S=sc.next();
		String T=sc.next();
		
		int x=Integer.parseInt(S, 2);
		int y=Integer.parseInt(T, 2);
	
	//計算
		for(int i=0;i<N;i++){
			int k=x&y;
			x+=k;
			y+=k;
		}
	
	//出力
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		
	}
}