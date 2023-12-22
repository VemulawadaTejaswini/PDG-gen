import java.util.Arrays;

public class Main {
    // field

    // method
    public static void main(String[] args) {
	//System.out.print("> ");
	java.util.Scanner scan = new java.util.Scanner(System.in);
	int arraySize = scan.nextInt();
	String[] input = new String[arraySize];
	int[] array = new int[arraySize];
	//System.out.print("> ");
	for (int i = 0; i < arraySize; i++){
	    array[i] = scan.nextInt();
	}
	
	BubbleSort bs = new BubbleSort(array.clone()); // バブルソート
	bs.bubbleSort(); // ソート
	bs.display();    // 表示
	System.out.println(bs.getCount());
    }
}
class BubbleSort {
    // -- field
    private int[] sort_array;
    protected int Count;
    
    
    // -- Constructor
    private BubbleSort() {}
    public BubbleSort(int[] sort_array) {
	this.sort_array = sort_array;
    }
    
    // -- Method
    public void display() {
	for (int i = 0; i < this.sort_array.length; i++) {
	    System.out.print(this.sort_array[i]);
	    if(i == this.sort_array.length-1) {
		break;
	    }
	    System.out.print(" ");
	}
	System.out.println();
    }

    public void swap(int x, int y) {
	int temp = this.sort_array[x];
	this.sort_array[x] = this.sort_array[y];
	this.sort_array[y] = temp;
    }

    public void bubbleSort() {
	for (int i = this.sort_array.length - 1; i > 0; i--) {
	    for (int j = 0; j < i; j++) {
		if (this.sort_array[j] > this.sort_array[j + 1]) {
		    swap(j, j + 1);
		    this.Count++;
		}
	    }
	}
    }

    public int getCount() {
    return this.Count;
    }
}

