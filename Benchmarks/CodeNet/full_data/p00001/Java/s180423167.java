import java.util.*;

class Main {
	
	static int[] height;
	final static int size = 10;

	public static void main (String [] args){
		printAns();	
	}

	public static void init(){
		height = new int[size];
		Scanner sc = new Scanner(System.in);
	
		for(int i=0; i<size; i++){
			height[i] = sc.nextInt();
		}
	}

	public static void sort(){
		int max;
		for(int i=0; i<size; i++){
			max = i;
			for(int j=i+1; j<size; j++)
				if(height[max]<height[j]) max = j;
			swap(i, max);
		}	
	}

	public static void swap(int i, int j){
		int tmp = height[i];
		height[i] = height[j];
		height[j] = tmp;
	}

	public static void printAns(){
		init();
		sort();

		for(int i=0; i<3; i++) System.out.println(height[i]);
	}
}