import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int n = sc.nextInt();
		int[][] map = new int[n][w+1];
		int[] ans = new int[w+1];
		for(int i=0;i<n;i++){
			String s = sc.next();
			int a, b;
			if(s.substring(1,2).compareTo(",")==0){
				a = Integer.valueOf(s.substring(0,1));
				b = Integer.valueOf(s.substring(2,s.length()));
			}else{
				a = Integer.valueOf(s.substring(0,2));
				b = Integer.valueOf(s.substring(3,s.length()));
			}
			map[i][a]=b;
			map[i][b]=a;
		}
		for(int i=1;i<=w;i++){
			int k = i;
			for(int j=0;j<n;j++){
				if(map[j][k]>0){
					k = map[j][k];
				}
			}
			ans[k] = i;
		}
		for(int i=0;i<w;i++){
			System.out.println(ans[i+1]);
		}
		
		
	}
}