import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;


public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());

        Scanner s = new Scanner(System.in);
        // int count = s.nextInt();
        // s.nextLine(); // throw away the newline.
        Scanner numScanner = new Scanner(s.nextLine());

		// String tmp_arr[] = new String[n];
		int arr[] = new int[n];
		
	    for(int i=0; i<n; i++){
            if (numScanner.hasNextInt()) {
                arr[i] = numScanner.nextInt();
            } else {
                System.out.println("You didn't provide enough numbers");
                break;
            }	        
	    }
		
		//tmp_arr = br.readLine().split(" ");
		//for(int i=0; i<n;i++){
		//	arr[i] = Integer.parseInt(tmp_arr[i]);
		//}
		counting_sort(arr);
	}
	
	public static void counting_sort(int[] arr){
		int n = arr.length;
		int k = 10001;
		
		int new_arr[] = new int[n]; // sorted array 
		int C[] = new int[k+1]; // times of appearing (length: k)
		
		for(int i=0; i<k; i++){
			C[i] = 0;
		}
		
		// record appearance
		for(int i=0; i<n; i++){
			C[arr[i]]++;
		}
		
		// C[i] makes the sum of appearance of the number less than i
		for(int i=1; i<=k; i++){
			C[i] = C[i] + C[i-1];
		}
			
		for(int i=n-1; i>=0; i--){
			new_arr[C[arr[i]]-1]= arr[i];
			C[arr[i]]--;
		}
		print_array(new_arr);
	}
	
	public static void print_array(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
			if(i != arr.length-1) System.out.print(" ");
			else System.out.print("\n");
		}
	}
}

