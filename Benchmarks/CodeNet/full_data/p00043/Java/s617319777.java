import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
	static final int LENGTH = 14;
	public static void main(String[] args) throws IOException{
		int[] n = new int[LENGTH];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = new String();
		StringBuilder buf = null;
		/*入力があれば処理を続ける*/
		while((input = br.readLine()) != null){
			buf = new StringBuilder();
			for(int i = 1; i <= 9; i++){
				n = getArray(input);
				/*数を１つ加えてソート*/
				n[LENGTH - 1] = i;
				Arrays.sort(n);
				/*同じ数が４つ以下で正解であれば出力バッファへ*/
				if(!hasFiveSameNum(n) && solve(0, n, false)){
					buf.append(i + " ");
				}
			}
			String out = buf.toString().trim();
			System.out.println((out.equals("")? "0" : out));
		}
	}
	public static boolean solve(int p, int[] array, boolean arrayHasSameTwo){
		boolean matchable = false;
		int begin = p;
		/*文字がない場合は正解*/
		if(array.length == 0)return true;
		/*1文字しかない場合は偽*/
		if(array.length == 1)return false;
		
		while(begin < array.length - 1){
			/*２つ取り出して検証*/
			if(checkSameTwo(begin, array)){
				if(arrayHasSameTwo)	return false;
				matchable |= solve(0, subArray(begin, 2, array), true);
			}
			/*３つ取り出して検証*/
			if(checkSameThree(begin, array)){
				matchable |= solve(0, subArray(begin, 3, array), false);
			}
			int[] index = checkSequentialThree(begin, array);
			if(index != null){
				matchable |= solve(0, subArray(index, array), false);
			}
			/*上記２つの結果の和が真なら正解*/
			if(matchable)	return true;
			/*偽なら位置を１つずらす*/
			begin++;
		}
		return false;
	}
	private static boolean checkSameTwo(int begin, int[] array){
		if(begin < array.length - 1){
			return array[begin] == array[begin + 1];
		}
		return false;
	}
	private static boolean checkSameThree(int begin, int[] array){
		if(begin < array.length - 2){
			return array[begin + 1] == array[begin] &&
					array[begin + 2] == array[begin + 1];
		}
		return false;
	}
	private static int[] checkSequentialThree(int begin, int[] array){
		int[] index = new int[3];
		int c = 0;
		index[c] = begin;
		int source = array[begin];
		for(int i = begin + 1; i < array.length; i++){
			if(array[i] == source + 1){
				index[++c] = i;
				source++;
				if(c == 2)	return index;
			}
		}
		return null;
	}
	private static int[] subArray(int begin, int length, int[] array){
		int[] ary = new int[array.length - length];
		for(int i = 0; i < begin; i++){
			ary[i] = array[i];
		}
		for(int i = begin; i + length< array.length; i++){
			ary[i] = array[i + length];
		}
		return ary;
	}
	private static int[] subArray(int[] index, int[] array){
		int[] ary = new int[array.length - index.length];
		int c = 0;
		for(int i = 0; i < array.length; i++){
			if(i == index[0] || i == index[1] || i == index[2]) continue;
			ary[c++] = array[i];
		}
		return ary;
	}
	private static int[] getArray(String str){
		char[] s = str.toCharArray();
		int[] array = new int[LENGTH];
		for(int i = 0; i < s.length; i++){
			array[i] = s[i] - '0';
		}
		return array;
	}
	private static boolean hasFiveSameNum(int[] array){
		int count = 0;
		for(int i = 1; i <= 9; i++){
			count = 0;
			for(int n : array){
				if(n == i)	count++;
				if(count == 5)return true;
			}
		}
		return false;
	}

}