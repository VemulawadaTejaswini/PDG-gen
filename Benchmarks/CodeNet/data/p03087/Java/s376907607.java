import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[][] l = new int[q][2];
		int[] ans = new int[q];
		String ac = "AC";
		for(int i = 0; i < q; i++){
			l[i][0] = sc.nextInt()-1;
			l[i][1] = sc.nextInt()-1;
		}
		int ackazu = 0;
		int[] acidx = new int[50001];
		s = s + "qq";
		for(int i = 0; i < n; i++){
			if(ac.equals(s.substring(i,i+2))){
				acidx[ackazu] = i;
				ackazu++;
				i++;
			}
		}
		for(int i = 0; i < q; i++){
			for(int j = 0; j < ackazu; j++){
				if(l[i][0] > acidx[j]){
					continue;
				}else if(acidx[j] >= l[i][1]){
					break;
				}else if(l[i][0] <= acidx[j] && acidx[j] < l[i][1]){
					ans[i]++;
				}
			}
		}
		for(int i = 0; i < q; i++){
			System.out.println(ans[i]);
		}
	}
}
