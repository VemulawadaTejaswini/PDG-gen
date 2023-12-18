import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int R=sc.nextInt();
		int S=sc.nextInt();
		int P=sc.nextInt();
		String T_sub = sc.next();
		String[] T = new String[N];
		String[] answer = new String[N];
		for(int i=0;i<N;i++) {
			T[i]=T_sub.substring(i,i+1);
		}
		
		int[] value= {R,S,P};
		String[] rps = {"r","s","p"};
		ArrayList<String> history_List = new ArrayList<String>();
		int[][] dp_list = new int[3][N];
		for(int i=0;i<3;i++) {
			for(int j=0;j<K;j++) {
				dp_list[i][j]=score_rsp(R,S,P,rps[i],T[j]);
			}
		}
		
		for(int i=0;i<K;i++) {
			for(int j=1;j<=(N-1-i)/K;j++) {
				for(int k=0;k<3;k++) {
					if(score_rsp(R,S,P,rps[k],T[i+K*j])>0) {
						dp_list[k][i+K*j]=value[k]+Math.max(dp_list[(k+1)%3][i+K*j-K],dp_list[(k+2)%3][i+K*j-K]);
					}else {
						dp_list[k][i+K*j]=Math.max(dp_list[(k+1)%3][i+K*j-K],dp_list[(k+2)%3][i+K*j-K]);
					}
					
				}
			}
		}
		int total=0;
		for(int i=0;i<K;i++) {
			total+=Math.max(dp_list[0][N-1-i], Math.max(dp_list[1][N-1-i],dp_list[2][N-1-i]));
		}
		System.out.println(total);
		
		
	}
	
	static int score_rsp(int R,int S,int P,String p1,String p2) {
		if(p1.equals("r") && p2.equals("r")) {
			return 0;
		}else if(p1.equals("r") && p2.equals("s")) {
			return R;
		}else if(p1.equals("r") && p2.equals("p")) {
			return 0;
		}else if(p1.equals("s") && p2.equals("r")) {
			return 0;
		}else if(p1.equals("s") && p2.equals("s")) {
			return 0;
		}else if(p1.equals("s") && p2.equals("p")) {
			return S;
		}else if(p1.equals("p") && p2.equals("r")) {
			return P;
		}else if(p1.equals("p") && p2.equals("s")) {
			return 0;
		}else if(p1.equals("p") && p2.equals("p")) {
			return 0;
		}else {
			System.out.println("score_rspの引数が間違っています。");
			return -1;
		}
	}

}
