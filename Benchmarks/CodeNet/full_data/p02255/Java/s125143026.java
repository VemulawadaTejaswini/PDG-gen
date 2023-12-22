import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		//?????°
		int num = Integer.parseInt(bf.readLine());
		
		//??????????´?
		int[] array = new int[num];
		
		//?????????
		String[] arrayString = bf.readLine().split(" ");
		
		for(int i=0;i<num;i++){
			array[i]=Integer.parseInt(arrayString[i]);
		}
		
		insertionSort(array,num);
		
	}
	
	private static void insertionSort(int[] array, int num){
		for(int i=0;i<num;i++){
			int var = array[i];
			int j=i-1;
			
			while(j>=0 && array[j]>var){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=var;
			showLog(array);
		}
	}
	
	private static void showLog(int[] array){
		for(int i=0;i<array.length;i++){
			System.out.printf("%d",array[i]);
			if(i!=array.length-1){
				System.out.printf(" ");
			}
		}
		System.out.println();
	}
}