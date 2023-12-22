import java.io.*;

class Main {
	public static void main(String args[]) throws IOException{
		//実行処理
		CountingSort();
	}

	public static void CountingSort()  throws IOException  { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int  num = Integer.parseInt(br.readLine());//要素数
		int array[] = new int[num];
		int max = 0;
		int[] sort = new int[num];
		
		//配列作成同時にカウント
		String s = br.readLine();
        String[] str = s.split(" ");
		for(int i = 0; i < num; i ++ ){
			array[i] = Integer.parseInt(str[i]);
			//比較して更新
			max = Math.max(max, array[i]);
		}
		int[] count = new int[max + 1];
		for(int i = 0; i < num; i ++ ){
			count[array[i]] ++;
		}
		//カウントの位置
		for(int i = 1; i <= max; i ++ ){
			count[i] += count[i - 1];
		}
		//ソート処理
		for(int i = num - 1; i >= 0; i -- ){
				count[array[i]] --;
				sort[count[array[i]]] = array[i];
				
		}
		//出力
		for(int i = 0; i < num; i ++ ){
			System.out.print(sort[i]);
			if( i == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
	}
}
