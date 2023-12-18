import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int[] A = new int[n];

		for(int i=0;i<n;i++)
			A[i] = sc.nextInt();

		Arrays.sort(A);

		ArrayList<Integer> mod = new ArrayList<Integer>();
		int cntm = 0;

		for(int i=1;i<=A[n-1];i++){
			if(A[0]%i==0||A[n-1]%i==0){
				mod.add(i);
				cntm++;
			}
		}

		int cnt = 2;
		cntm--;
		int num = 1;
		
		while(cntm>0){
			cnt = 2;
			num = mod.get(cntm);
			for(int i=0;i<n;i++){
				if(A[i]%num!=0){
					cnt--;
					if(cnt<1){
						break;
					}
				}
			}
			if(cnt>0)break;
			cntm--;
		}
		System.out.println(num);
	}
}