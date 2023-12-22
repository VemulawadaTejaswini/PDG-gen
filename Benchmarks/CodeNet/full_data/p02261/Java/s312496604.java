import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static enum cardMarkNum
	{
		S(83),
		H(72),
		C(67),
		D(68);
		
		private final int mark;
		
		private cardMarkNum(final int mark) {
			this.mark = mark;
		}
		
		public int getInt(){
			return this.mark;
		}
	}
	public static cardMarkNum getMark(final int id) {
		cardMarkNum[] marks = cardMarkNum.values();
		for (cardMarkNum type : marks) {
			if (type.getInt() == id) {
				return type;
			}
		}
		return null;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		int array_bubble[] = new int[num];
		int array_select[] = new int[num];
		
		array = makeDeck( array, num , scanner);
		
		array_bubble = bubbleSort(array, num);
		System.out.println("Stable");
		array_select = selectionSort(array, num);
		if( Arrays.equals( array_bubble,array_select) ) {
			System.out.println("Stable");
		}else {
			System.out.println("Not Stable");
		}
			
		
		scanner.close();
	}
	
	public static int[] bubbleSort( int[] Array, int num){ 
		int[] numArray = new int[num];
		int[] dig = new int[num];
		int[] out = new int[num];
		
		for(int i = 0; i < num; i ++)
		{
			dig[i] = Array[i] / 100;
			numArray[i] = Array[i] % 100;
		}
		
		//バブルソート処理
		for (int i = 0; i < num - 1; i++) {
				for (int j = num - 1; j > i; j--) {
					if (numArray[j - 1] > numArray[j]) {
						int work = numArray[j - 1];
						numArray[j - 1] = numArray[j];
						numArray[j] = work;
						int sub = dig[j - 1];
						dig[j - 1] = dig[j];
						dig[j] = sub;
					}
				}
			}
		
		for(int i = 0; i < num; i ++)
		{
			out[i] = (dig[i] * 100)+  numArray[i];
		}
		
		//出力
		output(out, num);
		return out;
	}

	public static int[] selectionSort( int[] Array, int num){
		int[] numArray = new int[num];
		int[] dig = new int[num];
		int[] out = new int[num];
		
		for(int i = 0; i < num; i ++)
		{
			dig[i] = Array[i] / 100;
			numArray[i] = Array[i] % 100;
		}
		
		//選択ソート
		for (int i = 0; i < num - 1; i++) {
			// 比較元の配列番号をセットする
			int comp = i;
			// 最小値の探索
			for (int j = i + 1; j < num; j++) {
				if (numArray[comp] > numArray[j]) {
					// 最少値設定
					comp = j;
				}
			}
			// 最小値が入れ替わっていなければ数値を入れ替えない
			if (i == comp) {
				continue;
			}
			//入れ替え処理
			int sub = numArray[i];
			numArray[i] = numArray[comp];
			numArray[comp] = sub;
			int work = dig[i];
			dig[i] = dig[comp];
			dig[comp] = work;
		}
		
		for(int i = 0; i < num; i ++)
		{
			out[i] = (dig[i] * 100)+  numArray[i];
		}
		
		//出力
		output(out, num);
		return out;
	}
	
	
	public static int[] makeDeck( int[] numArray, int num, Scanner scanner){
		int count = 0;
		byte[] mark_num = new byte[100];
		
		while( num > count ){
			String tranp = scanner.next();
			
			try {
				mark_num = tranp.getBytes("US-ASCII");
			} catch (Exception e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
		    switch(getMark(mark_num[0]))
		    {
		        case S:
		            numArray[count] = 100 + mark_num[1];
		            break;
		        case H:
		            numArray[count] = 200 + mark_num[1];
		            break;
		        case C:
		            numArray[count] = 300 + mark_num[1];
		            break;
		        case D:
		            numArray[count] = 400 + mark_num[1];
		            break;
		    }

		    count ++;
		}
		
	    return numArray;
	}
	
	public static void output( int[] numArray ,int num){
		int mark;
		String trump_num = "";
		
		//出力
		for(int i = 0; i < num; i ++ ){
			mark = numArray[i] / 100;
			byte[] sub = new byte[]{ (byte)(numArray[i] % 100) };
			
			try {
				trump_num = new String(sub, "US-ASCII");
			} catch (UnsupportedEncodingException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
			
			switch( mark )
		    {
		        case 1:
		        	System.out.print("S" + trump_num);
		            break;
		        case 2:
		        	System.out.print("H" + trump_num);
		            break;
		        case 3:
		        	System.out.print("C" + trump_num);
		            break;
		        case 4:
		        	System.out.print("D" + trump_num);
		            break;
		    }
			
			//改行か空白かの判別
			if( i == num - 1) {
			System.out.print("\n");
			}else {
				System.out.print(" ");
			}
		}
	}
}
