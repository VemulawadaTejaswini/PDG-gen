import java.util.Scanner;

class MergeSort{
	private int size;
	private int[] arr;
	private int[] sorted;
	
	public void set(int[] array){
		size = array.length;
		arr = array;
		sorted = new int[size];
	}
	
	public void sort(){
		if (size > 2){
			MergeSort ms1 = new MergeSort(), ms2 = new MergeSort();
			int[] left = new int[size/2];
			int[] right = new int[(size % 2 == 0) ? size/2 : size/2 + 1];
			System.arraycopy(arr, 0, left, 0, left.length);
			System.arraycopy(arr, left.length, right, 0, right.length);
			ms1.set(left);
			ms2.set(right);
			ms1.sort();
			ms2.sort();
			left = ms1.getSorted();
			right = ms2.getSorted();
			int LInc = 0, RInc = 0;
			while (true){
				if (left[LInc] > right[RInc]){
					sorted[LInc + RInc] = right[RInc];
					RInc++;
				}
				else if (left[LInc] < right[RInc]){
					sorted[LInc + RInc] = left[LInc];
					LInc++;
				}
				else{
					sorted[LInc + RInc] = left[LInc];
					LInc++;
					sorted[LInc + RInc] = right[RInc];
					RInc++;
				}
				if (RInc == right.length){
					for (int i = LInc; i < left.length; i++){
						sorted[i + RInc] = left[i];
					}
					break;
				}
				if (LInc == left.length){
					for (int i = RInc; i < right.length; i++){
						sorted[i + LInc] = right[i];
					}
					break;
				}
			}
		}
		else if (size == 2){
			if (arr[0] > arr[1]){
				sorted[0] = arr[1];
				sorted[1] = arr[0];
			}
			else{
				sorted = arr;
			}
		}
		else{
			sorted = arr;
		}
	}
	
	public int[] getSorted(){
		return sorted;
	}
}

public class Main {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		int[] arr = new int[nums];
		for (int i = 0; i < nums; i++){
			arr[i] = sc.nextInt();
		}
		MergeSort ms = new MergeSort();
		ms.set(arr);
		ms.sort();
		int[] sorted = ms.getSorted();
		for (int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i]);
			if (i != sorted.length - 1) System.out.print(' ');
		}
	}
}