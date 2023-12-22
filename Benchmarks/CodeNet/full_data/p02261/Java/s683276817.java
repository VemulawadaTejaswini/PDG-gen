import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());

		String[] C = scan.nextLine().split(" ");

		String[] arrayBubble = C.clone();
		String[] arraySelection = C.clone();

		BubbleSort(arrayBubble, N);
		SelectionSort(arraySelection, N);

		for(int i= 0; i < arrayBubble.length; i++){
	        System.out.print(arrayBubble[i]);
	        if(i < arrayBubble.length-1){
	            System.out.print(" ");
	        } else {
	            System.out.println();
	            }
	        }
		System.out.println("Stable");

		for(int i= 0; i < arraySelection.length; i++){
	        System.out.print(arraySelection[i]);
	        if(i < arraySelection.length-1){
	            System.out.print(" ");
	        } else {
	            System.out.println();
	            }
	        }
		/*if(arrayBubble == arraySelection) {
		System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}*/
		
		if(stable(arrayBubble, arraySelection) == true) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}


	public static void BubbleSort(String[] C, int n) {
		for(int i= 0; i <= n-1; i++) {
			for(int j = n-1; j >= i+1; j--) {
				if((int)(C[j].charAt(1)) < (int)(C[j-1].charAt(1))) {
					String temp = C[j];
					C[j] = C[j-1];
					C[j-1] = temp;
				}
			}
		}
	}

	public static void SelectionSort(String[] C, int n) {
		for(int i = 0; i <= n-1; i++){
            int minj = i;
            for(int j = i; j <= n-1; j++){
                if((int)(C[j].charAt(1)) < (int)(C[minj].charAt(1))){
                    minj = j;
                }
            }
            if(i != minj){
            	String tmp = C[i];
                C[i] = C[minj];
                C[minj] = tmp;
                }
            }
	}

	public static boolean stable(String[] a, String[] b) {
		if(!(a.length == b.length)) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(!(a[i].equals(b[i]))) {
				return false;
			}
		}
		return true;
	}
}
