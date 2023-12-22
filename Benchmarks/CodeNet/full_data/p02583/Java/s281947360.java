import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int A[] = new int[n];
	   for(int i=0;i<n;i++){
	       A[i]=sc.nextInt();
	   }
        System.out.println(find(A,n));
    } 
    static int find(int arr[], int n) 
    { 
        // Count of triangles 
        int count = 0; 
      
        // The three loops select three 
        // different values from array 
        for (int i = 0; i < n; i++) { 
            for (int j = i + 1; j < n; j++) { 
      
                // The innermost loop checks for 
                // the triangle property 
                for (int k = j + 1; k < n; k++) 
      
                    // Sum of two sides is greater 
                    // than the third 
                    if ( 
                        arr[i] + arr[j] > arr[k] 
                        && arr[i] + arr[k] > arr[j] 
                        && arr[k] + arr[j] > arr[i])
                        if(arr[i]!=arr[j]&&arr[j]!=arr[k]&&arr[k]!=arr[i])
                        count++; 
            } 
        } 
        return count; 
    } 
}
