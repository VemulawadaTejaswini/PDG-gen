import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			Inversions(num, br);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void Inversions(int num, BufferedReader br) throws IOException{ 
		int count = 0;
		int work;
		List<Integer> array = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i ++ ){
			array.add(br.read());
		}
		
		//バブルソート処理
		for (int i = 0; i < num - 1; i++) {
			for (int j = num - 1; j > i; j--) {
				if ( array.get(j - 1) > array.get(j) ) {
					work = array.get(j - 1);
					array.set(j - 1,array.get(j));
					array.set(j,work);
					count ++;
				}
			}
		}
         
        System.out.print(count);
		
	}
}

/* 実行時間計測用

		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms:計測時間");
*/
