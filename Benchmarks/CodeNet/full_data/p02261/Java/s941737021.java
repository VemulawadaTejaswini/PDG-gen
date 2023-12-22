import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		String[] array = br.readLine().split(" ");
		
		String[] bubbleArray = array.clone();
		bubbleSort(bubbleArray);
		show(array, bubbleArray);
		
		String[] sellectionArray = array.clone();
		selectionSort(sellectionArray);
		show(array, sellectionArray);
		
		
	}
	
	public static void bubbleSort(String[] array){
		int n = array.length;
		for(int i = 0; i < n; i++){
			for(int j = n - 1; i + 1 <= j; j--){
				int jv1 = Integer.valueOf(array[j].charAt(1));
				int jv2 = Integer.valueOf(array[j-1].charAt(1));
				if(jv1 < jv2){
					String v = array[j];
					array[j] = array[j-1];
					array[j-1] = v;
				}
			}
		}
	}
	
	public static void selectionSort(String[] array){
		int n = array.length;
		for(int i = 0; i < n; i++){
			int minj = i;
			int minv = Integer.valueOf(array[minj].charAt(1));
			
			for(int j = i; j < n; j++){
				int jv = Integer.valueOf(array[j].charAt(1));
				
				if(jv < minv){
					minj = j;
					minv = jv;
				}
			}
			
			String v = array[i];
			array[i] = array[minj];
			array[minj] = v;
			
		}
	}

	
	public static boolean isStable(String[] inputArray, String[] sortedArray){
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < inputArray.length; i++){
			map.put(inputArray[i], i);
		}
		String oldStr = null;
		for(String str: sortedArray){
			if(oldStr != null){
				int oldv = Integer.valueOf(oldStr.charAt(1));
				int nowv = Integer.valueOf(str.charAt(1));
				
				if(oldv == nowv && !(map.get(oldStr) < map.get(str))){
					return false;
				}
			}
			
			oldStr = str;
		}
		
		return true;
	}
	
	public static void show(String[] inputArray, String[] sortedArray){
		StringJoiner sj = new StringJoiner(" ");
		Arrays.stream(sortedArray).forEach(v -> sj.add(String.valueOf(v)));
		System.out.println(sj);
		
		if(isStable(inputArray, sortedArray)){
			System.out.println("Stable");
		}else{
			System.out.println("Not stable");
		}
	}
}

