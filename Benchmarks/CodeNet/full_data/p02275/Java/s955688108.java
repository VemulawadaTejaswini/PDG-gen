import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(br.readLine()).intValue();
		String[] strArray = br.readLine().split(" ");
		int[] array = new int[cnt];
		for(int i=0 ; i<strArray.length ; i++) {
			array[i] = new Integer(strArray[i]).intValue();
		}
		sort(array);
	}

	public static void sort(int[] array) {
		int[] cntArray = new int[10001];
		int[] resultArray = new int[array.length];
		for(int i=0 ; i<array.length ; i++) {
			cntArray[array[i]]++;
		}
		for(int i=1 ; i<cntArray.length ; i++) {
			cntArray[i] = cntArray[i] + cntArray[i-1];
		}
		for(int i=array.length-1 ; i>=0 ; i--) {
			resultArray[cntArray[array[i]]-1] = array[i];
			cntArray[array[i]]--;
		}
		StringBuffer b = new StringBuffer();
		for(int i=0 ; i<resultArray.length ; i++) {
			b.append(resultArray[i]).append(" ");
		}
		System.out.println(b.toString().trim());
	}

}