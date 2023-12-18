
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L[] = new int[N];
		int R[] = new int[N];
		ArrayList<int[]> q = new ArrayList<int[]>(); 		
		for(int i=0;i<N;i++){
			L[i]=sc.nextInt();
			R[i]=sc.nextInt();
			int tmp[] = {L[i],R[i]};
			q.add(tmp);
		}
		sc.close();
		long ans = 0;

		//左端で降順にソート
		Collections.sort(q,(q1,q2)->q2[0]-q1[0]);
		int lmax[] = q.get(0);
		//右端で昇順にソート
		Collections.sort(q,(q1,q2)->q1[1]-q2[1]);
		int rmin[] = q.get(0);
		//幅で降順にソート
		Collections.sort(q,(q1,q2)->(q2[1]-q2[0])-(q1[1]-q1[0]));
		int wmax[] = q.get(0);
		//左端最大の区間と、右端最小の区間を同じコンテストに出題するとき
		if(N==2);//N=2なら何もしない
		else{
		int k=0;
		while(wmax==lmax|wmax==rmin){
			k++;
			wmax = q.get(k);
		}
		ans = Math.max((rmin[1]-lmax[0]+1),0) + (wmax[1]-wmax[0]+1);
		}
		//左端最大の区間と、右端最小の区間が異なるコンテストに出題するとき
		//左端で降順にソート
		Collections.sort(q,(q1,q2)->q2[0]-q1[0]);
		int remain_rmin = Integer.MAX_VALUE;
		int tmp_ans=0;
		for(int i=0;i<N;i++){
			int tmp[] = q.get(i);
			
			if(i<=1) remain_rmin = lmax[1] ;
			else{
				remain_rmin = Math.min(remain_rmin, q.get(i-1)[1]);
			}
			tmp_ans = Math.max((rmin[1]-tmp[0]+1),0) + Math.max((remain_rmin-lmax[0]+1),0);
			ans = Math.max(ans,tmp_ans);
 		}	
		System.out.println(ans);
	}
}
