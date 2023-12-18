import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] h = new int[N];
		int min = Integer.MAX_VALUE;
		int sub = 0;
		
		for(int i=0; i<N; i++) {
			h[i]= sc.nextInt();
		}
      	//低い順に並べる
		Arrays.sort(h);
        //N-K+1通りのパターンでK本のうちで左から順に
        //最高から最低の木の高さを減算して最小値を求める
		for(int i=0; i<N-K+1; i++) {
			sub = h[i+K-1] - h[i];
			min = Math.min(min, sub);
		}
		System.out.println(min);
    }
}