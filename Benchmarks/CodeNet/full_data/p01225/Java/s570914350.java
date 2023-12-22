import java.util.Arrays;
import java.util.Scanner;

public class Main {

	int[] nums, c;
	int[][] as;
	char[] colors;

	//
	boolean dfs(int k){
		if(k==9){
			// 色が違ったらfalse
			for(int i=0;i<3;i++)if(colors[as[i][0]]!=colors[as[i][1]]||colors[as[i][1]]!=colors[as[i][2]])return false;
			for(int i=0;i<3;i++){
				int[] t = new int[3];
				// 数値の比較準備
				for(int j=0;j<3;j++)t[j]=nums[as[i][j]];
				Arrays.sort(t);
				// 数値が連続、または同一でなかったらfalse
				if(!(t[0]==t[1]&&t[1]==t[2]||t[0]+1==t[1]&&t[1]+1==t[2]))return false;
			}
			return true;
		}
		// 全パターンを生成
		for(int i=0;i<3;i++){
			if(c[i]==3)continue;
			as[i][c[i]] = k;
			c[i]++;
			if(dfs(k+1))return true;
			c[i]--;
		}
		return false;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		int handNum = sc.nextInt();
		while(handNum--!=0){
			nums = new int[9]; colors = new char[9]; c = new int[3];
			for(int i=0;i<9;i++)nums[i]=sc.nextInt();
			for(int i=0;i<9;i++)colors[i]=sc.next().charAt(0);
			as = new int[3][3];
			System.out.println(dfs(0)?1:0);
		}

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
