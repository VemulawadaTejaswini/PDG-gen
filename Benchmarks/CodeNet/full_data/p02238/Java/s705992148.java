import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		//要素数
		int[][] time = new int[num + 1][num + 1];
		
		for(int i = 0; i < num; i ++ ){		//要素数分処理
			time = make_array(time, num, scanner);
		}
		
		DepthFirstSearch(time,num);
		
		scanner.close();
	}

	public static void output(int[] find,int[] ans, int num){
	   //出力
	   StringBuilder sb = new StringBuilder("");
	   for (int i = 0; i < num; i++) {
		  sb.append( i + 1 ).append(" ").append( find[i] )
		  		.append(" ").append( ans[i] ).append( "\n" );
	   }
		System.out.print(sb);
	}
	
	public static void DepthFirstSearch(int[][] exetime, int num){
		Deque<Integer> deq = new ArrayDeque<Integer>();
		int[] find = new int[num + 1];			//格納用配列
		int[] ans = new int[num + 1];
		int time = 0;
		
		for (int k = 0; k < num; k ++ ) {
			if (find[k] != 0){
				continue;
			}
			 
			deq.push(k);
			
			while(!deq.isEmpty()) {
				int top = deq.peek();
				if (find[top] == 0){
					find[top] = ++time;
				}
				
				int j;
				for (j = 0; j < num; j++) {
					if (exetime[top][j] == 1 && find[j] == 0) {
						deq.push(j);
						find[j] = ++time;
						break;
					}
				}
				if ( j == num ) {
					deq.pop();
					ans[top] = ++time;
				}
			}
		}

		output(find,ans, num);					//出力呼び
	}
	
	public static int[][] make_array(int[][] array,int num, Scanner scanner){
		int off = scanner.nextInt();		//いらないけど仕方ない
		int ver_num = scanner.nextInt();	//頂点数
		
		//頂点の分その場所を1にしていく
		for(int j = 0; j < ver_num; j ++ ){
			array[off - 1][scanner.nextInt() - 1] = 1;
		}
		return array;
	}
}
