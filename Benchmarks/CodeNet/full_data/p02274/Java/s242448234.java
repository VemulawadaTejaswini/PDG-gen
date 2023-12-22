import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	//static int [] sortedArray;

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//int[] inputArray = new int[n];
		Element[] inputArray = new Element[n];
		//sortedArray = new int[n];
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			//inputArray[i] = Integer.parseInt(tmpArray[i]);
			inputArray[i] = new Element(i, Integer.parseInt(tmpArray[i]));
			//sortedArray[i] = inputArray[i];
		}
		//Arrays.sort(inputArray);
		System.out.println( MergeSort(inputArray, 0, n));
		
//		System.out.println(inversion(inputArray));
	}
	
	static int inversion(Element[] array){
		int result = 0;
		for(int i = 0 ; i < array.length ; i++){
			if(i > array[i].id){
				result += i - array[i].id;
			}
		}
		
		return result;
	}
	
	static long Merge (Element[] array, int left, int mid, int right){
		int n1 = mid - left;
		int n2 = right - mid;
		long result = 0;
		Element[] L = new Element[n1 + 1];
		Element[] R = new Element[n2 + 1];
		
		for(int i = 0; i < n1 ; i++){
			L[i] = array[left + i];
		}
		
		for(int i = 0; i < n2 ; i++){
			R[i] = array[mid + i];
		}
		L[n1] = new Element(-1, Integer.MAX_VALUE);
		R[n2] = new Element(-1, Integer.MAX_VALUE);
		int i = 0;
		int j = 0;
		for(int k = left ; k < right ; k++){
			if(L[i].data <= R[j].data){
				array[k] = L[i];
				//System.out.print(L[i].data+" ");
				i++;
				
			}
			else {
				array[k] = R[j];
				if(n1 + j - k + left > 0 ){
					result += n1 + j - (k - left);
					//System.out.println("n1 + j:"+(n1+j)+" k - left= "+(k - left));
					//System.out.println("R["+j+"](" +R[j].data+ ") moves " +(n1 + j - (k - left)) );
					//result ++;
				}
				//System.out.println("R["+j+"]="+R[j].data);
				//System.out.print(R[j].data+" ");
				j++;
				
			}
		}
		//System.out.println();
		return result;
	}
	
	static long MergeSort (Element[] array, int left, int right){
		long result = 0;
		if(left + 1 < right){
			int mid = (left + right)/2;
			result += MergeSort(array, left, mid);
			result += MergeSort(array, mid, right);
			result += Merge(array, left, mid, right);
		}
		
		return result;
	}
	

}


class Element implements Comparable{
	int id;
	int data;
	
	public Element (int id, int data){
		this.id = id;
		this.data = data;
	}

	public int compareTo(Element data) {
		// TODO Auto-generated method stub
		if(this.data < data.data){
			return -1;
		}
		else if(this.data == data.data){
			return 0;
		}
		else {
			return 1;
		}
	}

	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}