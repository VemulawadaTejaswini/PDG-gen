import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
        String[] array = scanner.nextLine().split(" ");
        scanner.close();
 
        String[] arrayB = array.clone();
        String[] arrayS = array.clone();
        
        BubbleSort(arrayB, n);
        SelectionSort(arrayS, n);
        
        //BubbleSort printing
        System.out.print(arrayB[0]);
        for (int i = 1; i < n; i++)
            System.out.print(" " +arrayB[i]);
        System.out.println();
        System.out.println("Stable");
        
        //SelectionSort printing
        System.out.print(arrayS[0]);
        for (int i = 1; i < n; i++)
            System.out.print(" " +arrayS[i]);
        System.out.println();
         
        if (isStable(arrayB, arrayS, n))
            System.out.println("Stable");
        else
            System.out.println("Not stable");
	}
	
	
	public static void BubbleSort(String[] a, int n){
		String key = "";
		int j = 1000;
		for (int i = 0; i < n; i++) {
			for (j = n-1; j>i; j--) {
				if (a[j].charAt(1) < a[j-1].charAt(1)){
					key = a[j];
					a[j] = a[j-1];
					a[j-1] = key;
				}		
			}
		}			
	}
	
	private static void SelectionSort(String[] a, int n){
		String key = "";
		int mini = 0;
		for (int i = 0; i < n; i++) {
			mini = i;
			for (int j = i; j < n; j++) {
				if (a[j].charAt(1) < a[mini].charAt(1))
					mini = j;
			}
			if (i != mini){
				key = a[i];
				a[i] = a[mini];
				a[mini] = key;
			}
		}	
	}
	private static boolean isStable(String[] a, String[] b, int n){
		for (int i = 0; i < n; i++)
            if (a[i].charAt(0) != b[i].charAt(0))
                return false;
        return true;
    }
	
}

