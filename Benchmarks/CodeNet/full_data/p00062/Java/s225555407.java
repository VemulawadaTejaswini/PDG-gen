
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> numBottomost = new ArrayList<Integer>();
		String buf;
		while((buf = br.readLine()) != null){
			int[] array = new int[10];
			char[] n = buf.toCharArray();
			for(int i = 0; i < n.length; i++){
				array[i] = n[i] - '0';
			}
			numBottomost.add(getNumBottommost(array));
		}
		
		for(int n : numBottomost){
			System.out.println(n);
		}
	}
	private static int getNumInTheOnePlace(int x, int y){
		int sum = x + y;
		return sum % 10;
	}
	private static int[] getNextArray(int[] array){
		int[] n = new int[array.length - 1];
		for(int i = 0; i + 1 < array.length; i++){
			n[i] = getNumInTheOnePlace(array[i], array[i + 1]);
		}
		return n;
	}
	public static int getNumBottommost(int[] array){
		int length = array.length;
		int[] n = array;
		while(length != 1){
			n = getNextArray(n);
			length = n.length;
		}
		return n[0];
	}
}