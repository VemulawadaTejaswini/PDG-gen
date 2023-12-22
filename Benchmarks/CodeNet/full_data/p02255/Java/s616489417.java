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

	InsertionSort is = new InsertionSort(array.clone()); // 挿入ソート
	is.display();        // 表示
	is.insertionSort(); // ソート
    }
}
class InsertionSort{
    // Field
    private int[] sort_array;

    // Constructor
    private InsertionSort(){} 
    public InsertionSort(int[] sort_array){
	this.sort_array = sort_array;
    }

    // Method
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
    
    public void insertionSort() {
	/*
	for (int i = 1; i < this.sort_array.length; i++) {
	    int num = this.sort_array[i];
	    for (int j = i - 1; j >= 0; j--) {
		if (this.sort_array[j] > num) {
		    this.sort_array[j + 1] = this.sort_array[j];
		    if (j == 0) {
			this.sort_array[j] = num;
		    }
		} else {
		    this.sort_array[j + 1] = num;
		    break;
		}
	    }
	    this.display();
	}
	*/
	
	// swap文を使うパターン
	for (int i = 1; i < this.sort_array.length; i++) {
	    for (int j = i - 1; j >= 0; j--) {
		if (this.sort_array[j] > this.sort_array[j + 1]) {
		    this.swap(j, j + 1);
		}
	    }
	    this.display();
	}
    }
}

