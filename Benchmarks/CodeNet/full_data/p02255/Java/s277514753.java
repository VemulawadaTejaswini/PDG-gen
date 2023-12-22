import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	//input elements
	int n = Integer.parseInt(scan.nextLine());
	String[] inputs = scan.nextLine().split(" ");
	int[] cards = new int[n];
	for (int i = 0; i < n; i++) {
	    cards[i] = Integer.parseInt(inputs[i]);
	}

	//insertion sort
	for (int i = 1; i < n; i++) {
	    //show cards
	    printArray(cards);
	    int key = cards[i];
	    int j = i - 1;
	    while (j >= 0 && cards[j] > key) {
		cards[j+1] = cards[j];
		j--;
	    }
	    cards[j+1] = key;
	}
	//show cards
	printArray(cards);
    }
    static void printArray(int[] a){
	for (int i = 0; i < a.length-1; i++) {
	    System.out.print(a[i] + " ");
	}
	System.out.println(a[a.length-1]);
    }
}