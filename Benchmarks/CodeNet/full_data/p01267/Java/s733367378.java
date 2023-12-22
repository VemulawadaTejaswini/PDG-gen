import java.util.*;

public class Main{
	// N A B C X
	// Y1 Y2 ... YN 
	// x' = (A テδ?x + B) mod C
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, a, b, c, x;
		
		while(true){
			// ティツェツュテ」ツ?ソテ・ツ渉姪」ツつ?
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();
			x = in.nextInt();
			
			if(n == 0 && a == 0 && b == 0 && c == 0 && x == 0) break;
			
			int[] y = new int[n];
			for(int i=0;i<n;i++){
				y[i] = in.nextInt();
			}
			
			System.out.println(solve(n,a,b,c,x,y));
		}
	}

	static int solve(int n, int a, int b, int c, int x, int[] y){
		int count = 0; // frameテヲツ閉ー
		
		if(n==1 && y[0]==x) return 0;
		
		for(int i=0;i<n;i++){
			while(true){ 
				//System.out.println("i="+i+" x="+x+" count="+count);
				if(count>10000 || y[i]==x){
					x = (a*x+b)%c; if(i+1 < n)count++; // テヲツャツ。テ」ツ?ォティツ。ツ古」ツ?湘」ツ?淌」ツつ?」ツ?ョテ・ツ?ヲテァツ青?
					break;
				}
				count++;
				x = (a*x+b)%c;
			}
		}
		
		return (count > 10000 ? -1 : count);
	}
}