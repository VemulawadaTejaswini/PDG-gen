import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N+1];
		for(int i=1; i<=N; i++){
			P[i] = sc.nextInt();
		}
		List<List<int[]>> answer = new ArrayList<>();//int[MAXx, MAXy, GOODx, GOODy]
		List<List<String>> string = new ArrayList<>();
		for(int i=0; i<=N; i++){//i個目
			if(i==0){
				List<int[]> list = new ArrayList<>();
				list.add(new int[]{0, 0, 0, 0});
				answer.add(list);
				List<String> list2 = new ArrayList<>();
				list2.add("");
				string.add(list2);
			}else{
				List<int[]> list = new ArrayList<>();
				for(int[] mlist: answer.get(i-1)){//0X
					if(mlist[0] < P[i]){
						list.add(new int[]{P[i], mlist[1], mlist[2]+1, mlist[3]});
					}else{
						list.add(new int[]{mlist[0], mlist[1], mlist[2], mlist[3]});
					}
				}
				for(int[] mlist: answer.get(i-1)){//1Y
					if(mlist[1] < P[i]){
						list.add(new int[]{mlist[0], P[i], mlist[2], mlist[3]+1});
					}else{
						list.add(new int[]{mlist[0], mlist[1], mlist[2], mlist[3]});
					}
				}
				answer.add(list);
				List<String> list2 = new ArrayList<>();
				for(String mlist: string.get(i-1)){
					list2.add(mlist+"0");
				}
				for(String mlist: string.get(i-1)){
					list2.add(mlist+"1");
				}
				string.add(list2);
			}
		}
		List<String> ans = new ArrayList<>();
		for(int i=0, l=answer.get(N).size(); i<l; i++){
			if(answer.get(N).get(i)[2] == answer.get(N).get(i)[3]){
				ans.add(string.get(N).get(i));
			}
		}
		if(ans.size() == 0){
			System.out.println("-1");
			System.out.flush();
			return;
		}
	}
}