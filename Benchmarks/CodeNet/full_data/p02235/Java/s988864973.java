import java.util.*;

public class Main {
	
	public static int lcs(String a, String b, int n, int k) {
		
		int[][] arr = new int[n+1][k+1];
		for (int i = 0; i <= n; i++) 
        { 
            for (int j = 0; j <= k; j++) 
            { 
                if (i == 0 || j == 0) {
                    arr[i][j] = 0; 
                }
                else if (a.charAt(i-1) == b.charAt(j-1)) { 
                    arr[i][j] = arr[i-1][j-1] + 1; 
                }
                else {
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]); 
                }
            } 
        }
        int count = 0;
        int i = n;
        int j = k; 
        while (i > 0 && j > 0) 
        { 
            if (a.charAt(i-1) == b.charAt(j-1)) 
            { 
                count++;  
                i--;  
                j--;      
            } 
            else if (arr[i-1][j] > arr[i][j-1]) 
                i--; 
            else
                j--; 
        } 
        
        return count;
        
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sets = in.nextInt();
		for(int i = 0; i < sets; i++) {
			String a = in.next();
			String b = in.next();
			int result = lcs(a, b, a.length(), b.length());
			System.out.println(result);
		}
		
		in.close();
	}

}
