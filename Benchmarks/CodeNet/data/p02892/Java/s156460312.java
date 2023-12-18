import java.util.*;

public class Main
{
	

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean[][] s = new boolean[200][200];
		int[] num = new int[200];

		for(int i = 0 ; i < n ; i++){
			String tmp = sc.next();
			for(int j = 0 ; j < n ; j++){
				s[i][j] = (tmp.charAt(j) == '1');
			}
			num[i] = 0;
		}

		int ans = -1;

		for(int k = 0 ; k < n ; k++){
			LinkedList<Integer> que = new LinkedList<Integer>();
			int kans = 1;

			for(int i = 0 ; i < n ; i++){
				num[i] = 0;
			}

			que.add(k);
			num[k] = 1;
			
			while(que.size() > 0){
				Integer vNum = que.poll();
				for(int i = 0 ; i < n ; i++){
					if(num[i] == 0){
						if(s[vNum][i]){
							num[i] = num[vNum]+1;
							kans = num[i];
							que.add(i);
						}
					}
				}
			}

			for(int i = 0 ; i < n && ans != -1 ; i++){
				for(int j = i+1 ; j < n ; j++){
					if(s[i][j]){
						if(num[i] - num[j] != 1 && num[j] - num[i] != 1){
							kans = -1;
							break;
						}
					}
				}
			}

			if(ans < kans){
				ans = kans;
			}
		}

		System.out.println(ans);
	}
}