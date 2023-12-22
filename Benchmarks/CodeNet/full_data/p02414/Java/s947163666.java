import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args)
	throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = TempReaderCall.splitIntArrayFromString(TempReaderCall.getStdInRead(br));
		
		ArrayList<String> input1 = TempReaderCall.getStdInReadlines(br, n[0]);
		ArrayList<String> input2 = TempReaderCall.getStdInReadlines(br, n[1]);
		
		int[][] array1, array2;
		long[][] ans;
		array1 = getArrayfromStringlist(input1);
		array2 = getArrayfromStringlist(input2);
		
		ans = calcMatrixMultiplication(array1, array2);
		
		printArray(ans);
	}
	
	static void printArray(long[][] array){
		for(int i=0; i<array.length; i++){
			System.out.println(getStringlinefromArray(array[i]));
		}
	}
	
	
	static String getStringlinefromArray(long line[]){
		String data = "";
		for (int i=0; i<line.length-1; i++)
			data = data + Long.toString(line[i]) + " ";
		
		data = data + line[line.length-1];
		return data;
	}
	
	static int[][] getArrayfromStringlist(ArrayList<String> inputdata){
		int[][] array = new int[inputdata.size()][];
		
		for (int i=0; i<inputdata.size(); i++){
			array[i] = TempReaderCall.splitIntArrayFromString(inputdata.get(i));
		}
		
		return array;
	}
	
	static long[][] calcMatrixMultiplication(int[][] array1, int[][] array2){
		long[][] ans = new long[array1.length][];
		
		for (int i = 0; i < ans.length; i++){
			ans[i] = new long[array2[0].length];
			for (int j=0; j<ans[i].length; j++)
				ans[i][j] = calcMatrixMultiplicationElement(array1, array2,i,j);
		}
		
		return ans;
	}
	
	static long calcMatrixMultiplicationElement(int[][] array1, int[][] array2,int i,int j) {
		long ans = 0;
		for (int k=0; k < array2.length; k++){
			ans += array1[i][k] * array2[k][j];
		}
		
		return ans;
	}

}


class TempReaderCall{
	
	static ArrayList<String> getStdInReadlines(BufferedReader br, int line) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < line; i++)
			list.add(br.readLine());
		return list;
	}
	
	static String getStdInRead(BufferedReader br) throws IOException {
		return (br.readLine());
	}
	
	
	static int[] splitIntArrayFromString(String st) {
		String[] sts = st.split(" ");
		int[] data = new int[sts.length];
		
		for (int i=0;i<sts.length;i++){
			data[i] = Integer.parseInt(sts[i]);
		}
		
		return data;
	}
}