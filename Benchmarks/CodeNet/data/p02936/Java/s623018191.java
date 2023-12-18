import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[][] node = new int[3][200001];	//parent,q,cnt

		int a = 0;
		int b = 0;
		for(int i = 0 ; i < n-1 ; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			node[0][b] = a;
		}

		int p = 0;
		int x = 0;
		for(int i = 0 ; i < q ; i++){
			p = sc.nextInt();
			x = sc.nextInt();
			node[1][p] += x;
		}

		int ans = 0;
		int pos = 0;
		for(int i = 1 ; i <= n ; i++){
			ans = 0;
			pos = i;
			while(pos != 0){
				if(node[2][pos] == 0){
					ans += node[1][pos];
					pos = node[0][pos];
				}else{
					ans += node[2][pos];
					pos = 0;
				}
			}
			node[2][i] = ans;
			System.out.printf(""+ans+" ");
		}
	}
}