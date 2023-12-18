import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int solve(int hPattern , int S[][] , int K){
		int H = Integer.bitCount(hPattern) + 1;
		int W = S[0].length;
		int A[][] = new int[H][W];
		List<Integer> hcuts = new ArrayList<Integer>();
		for(int i = 0 ; i < S.length ; ++i){
			if((hPattern & (1 << i)) != 0){
				hcuts.add(i);
			}
		}
		hcuts.add(S.length);
		for(int w = 0 ; w < W ; ++w){
			for(int i = 0 ; i < H ; ++i){
				int sum = 0;
				int l = i == 0 ? 0 : hcuts.get(i - 1) + 1;
				int r = Math.min(hcuts.get(i) , S.length - 1);
				for(int j = l ; j <= r ; ++j){
					sum += S[j][w];
				}
				A[i][w] = sum;
				if(sum > K){
					return -1;
				}
			}
		}
		int cum[] = new int[A.length];
		int cut = 0;
		for(int w = 0 ; w < W ; ++w){
			boolean needCut = false;
			for(int i = 0 ; i < H ; ++i){
				if(cum[i] + A[i][w] > K){
					needCut = true;
				}
			}
			if(needCut){
				cut++;
				Arrays.fill(cum, 0);
			}
			for(int i = 0 ; i < H ; ++i){
				cum[i] = cum[i] + A[i][w];
			}
		}
//		System.out.println(Integer.toBinaryString(hPattern)+" "+hcuts+" "+H);
//		System.out.println(Arrays.deepToString(A)+" "+cut +" "+(cut + H - 1));
		return cut;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int S[][] = new int[H][W];
		for(int i = 0 ; i < H ; ++i){
			String s = sc.next();
			for(int j = 0 ; j < W ; ++j){
				S[i][j] = s.charAt(j) - '0';
			}
		}
		int ret = H * W;
		int P = 1 << (H - 1);
		for(int p = 0 ; p < P ; ++p){
			int r = solve(p , S , K);
			if(r >= 0){
				ret = Math.min(ret, r + Integer.bitCount(p));
			}
		}
		System.out.println(ret);
	}
}
