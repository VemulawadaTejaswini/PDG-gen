import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeetCode {
	
	public static void main(String[] args) {
		
		// Set up
		Scanner in = new Scanner(System.in);
		
		// Multiple games
        while (in.hasNextInt()) {
			
			// Read in data to A and B
    		int[] A = new int[4];
    		int[] B = new int[4];
			for (int i = 0; i < 4; i++) {
				A[i] = in.nextInt();
			}
			for (int i = 0; i < 4; i++) {
				B[i] = in.nextInt();
			}
			
			// Populate D
			int[] D = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			for (int i = 0; i < 4; i++) {
				if (A[i] != B[i]) {
					D[A[i]]++;
				}
			}
			
			// Count results
			int num_hits = 0;
    		int num_blows = 0;
			for (int i = 0; i < 4; i++) {
				if (A[i] == B[i]) {
					num_hits++;
				}
				else if (D[B[i]] == 1) {
					num_blows++;
				}
			}
			
			// Print results
			System.out.println(num_hits + " " + num_blows);
			
        }
        
        // Done
        in.close();
		
	}
	
}