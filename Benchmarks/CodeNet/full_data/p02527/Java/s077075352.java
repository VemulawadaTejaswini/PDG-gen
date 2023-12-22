import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Integer[] num;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		num = new Integer[n];
		String str = "";
		for(int i=0;i<n;i++){
			num[i] = scan.nextInt();
		}
		sort(0,num.length-1);
		
		
		for(int i:num){
			str += i+" ";
		}
		
		System.out.println(str.substring(0,str.length()-1));
	}
	
	static void sort(int left, int right){
		if (left < right) {
			int middle = (left+right)/2;
			int pivot = num[middle];
			num[middle] = num[left];
			int p = left;
			for (int i=left+1;i<=right;i++) {
				if (num[i] > pivot) {
					p = p + 1;
					swap(p, i);
				}
			}
			num[left] = num[p];
			num[p] = pivot;
			sort(left, p-1);
			sort(p+1, right);
		}
	}

	static void swap(int i, int j) {
		int tmp = num[i];
		num[i] = num[j];
		num[j] = tmp;
	}
}