import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input	 = in.readLine();
		String S	 = in.readLine();

		int N = Integer.parseInt(input.split(" ")[0]);

		int[] s = new int[N];
		int R=0;
		int G=0;
		int B=0;

		for(int i = 0;i<N;i++) {
			if(S.charAt(i)=='R') {
				s[i]=0;
				R++;
			}else if(S.charAt(i)=='G') {
				s[i]=1;
				G++;
			}else {
				s[i]=2;
				B++;
			}
		}
		long ans=R*G*B;

		for(int i = 0; i<N; i++) {
			for(int j=1;i+2*j<N;j++) {
				if(s[i]!=s[i+j] && s[i+j]!=s[i+2*j] && s[i]!=s[i+2*j]) {
					ans--;
				}
			}
		}

		System.out.println(ans);





//		int N = scanner.nextInt();
//		String S = scanner.next();
//
//		List<Integer> R = new ArrayList<>();
//		List<Integer> G = new ArrayList<>();
//		List<Integer> B = new ArrayList<>();
//
//		for(int i=0;i<N;i++){
//			char c = S.charAt(i);
//			if(c=='R') {
//				R.add(i);
//			}else if(c=='G') {
//				G.add(i);
//			}else {
//				B.add(i);
//			}
//		}

		//愚直にSに対してFor文で良かったな…

//		int minus=0;
//		for(int rIndex=0;rIndex<R.size();rIndex++) {
//			for(int gIndex =0;gIndex<G.size();gIndex++) {
//				int r = R.get(rIndex);
//				int g =G.get(gIndex);
//				int num =0;
//				if((r+g)%2==0 && B.contains((r+g)/2)) {
//						minus++;
//				}if(r<g) {
//					num=g-r;
//					if(B.contains(r-num)||B.contains(g+num)) {
//						minus++;
//					}
//				}else{
//					num = r-g;
//					if(B.contains(g-num)||B.contains(r+num)) {
//					}
//					minus++;
//				}
//			}
//		}

		//		int minus=0;
		//		for(int rIndex=0;rIndex<=N/2-1;rIndex++) {
		//			for(int gIndex =G.get(tansaku(R.get(rIndex),G));gIndex<=G.size()/2;gIndex++) {
		//				int num = G.get(gIndex)-R.get(rIndex);
		//				if(B.contains(G.get(gIndex)+num)) {
		//					minus++;
		//				}
		//			}
		//		}

//		System.out.println(R.size()*G.size()*B.size()-minus/2);

		//		for(int r :R){
		//			int gTarget = tansaku(r,G);
		//			if(gTarget == G.size()) {
		//				break;
		//			}
		//			int gNum = G.size()-gTarget;
		//
		//			int bTarget = tansaku(G.get(gTarget),B);
		//			if(bTarget == B.size()) {
		//				break;
		//			}
		//			if(b) {
		//
		//			}
		//
		//		}


	}

	static int tansaku(int target, List<Integer> list ) {
		int R=list.size();
		while (target < R) {
			int M = (target+R)/2;
			if (list.get(M) == target) {
				return M;
			}
			else if (list.get(M) > target) {R = M;}
			else if (list.get(M) < target) {target = M+1;}
		}
		return 0;
	}
}
