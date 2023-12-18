import java.util.*; 
import java.io.*; 

public class Main {
	public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); 
       int arr[] = new int[n]; 
       ArrayList <Integer> even = new ArrayList<>();
       
       for(int i = 0; i<n; i++) {
    	   arr[i] = sc.nextInt();
    	   if(arr[i] % 2 == 0) {
    		   even.add(arr[i]); 
    	   }
       }
       boolean ans = false; 
       for(Integer i : even) {
    	   if(i % 3 == 0 || i % 5 == 0) {
    		   ans = true; 
    	   }
    	   else {
    		   ans = false; 
    		   break; 
    	   }
       }
       if(ans) {
    	   System.out.println("Yes"); 
       }
       else System.out.println("No"); 
       
	}
}
