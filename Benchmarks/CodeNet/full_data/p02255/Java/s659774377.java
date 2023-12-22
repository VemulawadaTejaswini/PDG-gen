import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
 
        for(int i=0; i<n; i++)
            arr[i] = scanner.nextInt();
 
        for(int i=0; i<arr.length; i++){
            int idx = i;
 
            while(idx > 0 && arr[idx-1] > arr[idx]){
                int temp = arr[idx-1];
                arr[idx-1] = arr[idx];
                arr[idx] = temp;
                idx--;
            }
            Show(arr);
        }
 
    }
 
    static void Show(int[] arr){
        int i;
        for(i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[i]);
	}
}
